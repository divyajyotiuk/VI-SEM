import RPi.GPIO as GPIO
import time

sensor = 16
sensor2 = 11

GPIO.setmode(GPIO.BOARD)
GPIO.setup(sensor,GPIO.IN)
GPIO.setup(sensor2,GPIO.IN)

print "IR Sensors Ready....."
print " "
count = 0
try: 
	while True:
		if GPIO.input(sensor) :
			print "Vehicles are not entering..."
			time.sleep(1)
		else:
			count += 1 
                        print "{} Object added in the queue".format(count)
                        while GPIO.input(sensor) != True:
                                print "Object is still "
                                time.sleep(0.2)

		if GPIO.input(sensor2):
			print "Vehicles are not leaving..."
			time.sleep(1)
		else:
			count -= 1
                        print "{} Objects left in the queue".format(count)
			time.sleep(1)
except KeyboardInterrupt:
	GPIO.cleanup()
