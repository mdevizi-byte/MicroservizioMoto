@echo off
cls
echo Aspetto che l'app si avvii...
timeout /t 10 /nobreak
echo.
echo === Testo 1: GET tutti i bikes ===
curl -X GET http://localhost:8082/api/bikes
echo.
echo.
echo === Testo 2: POST nuovo bike (Yamaha R1) ===
curl -X POST http://localhost:8082/api/bikes ^
  -H "Content-Type: application/json" ^
  -d "{\"name\":\"Yamaha R1\",\"price\":15000.00}"
echo.
echo.
echo === Testo 3: GET tutti i bikes dopo INSERT ===
curl -X GET http://localhost:8082/api/bikes
echo.
pause

