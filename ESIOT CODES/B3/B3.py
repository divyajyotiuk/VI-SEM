import serial

ser = serial.Serial('/dev/ttyUSB0', 9600, timeout=0.5)

while True:
	ser.write('Hello User \r\n')
	incoming = ser.readline().strip()
	print 'Received Data : ' + incoming
