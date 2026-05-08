[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
$ProgressPreference = 'SilentlyContinue'

Write-Host "=== Test 1: GET all bikes ===" -ForegroundColor Cyan
$response = Invoke-WebRequest -Uri "http://localhost:8083/api/bikes" -Method GET -UseBasicParsing -ErrorAction SilentlyContinue
if ($response.StatusCode -eq 200) {
    Write-Host "OK GET /api/bikes - Status: $($response.StatusCode)" -ForegroundColor Green
    Write-Host "Response body:"
    $response.Content | ConvertFrom-Json | Format-Table -AutoSize
} else {
    Write-Host "ERRORE: $($response.StatusCode)" -ForegroundColor Red
}

