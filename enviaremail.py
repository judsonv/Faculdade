import json
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
import smtplib

msg=MIMEMultipart()
message="Olá você foi pythackeado rsrs"

password = "***107489906jvl@7***"
msg['From'] = "***judsonv82@gmail.com***"
msg['To'] = "***judsoninfra20@gmail.com***"
msg['Subject'] = "Olá você sera hackeado!"

msg.attach(MIMEText(message, 'plain'))
server = smtplib.SMTP('smtp@gmail.com', port=587)
server.starttls()
server.login(msg['From'], password)
server.sendmail(msg['From'], msg['To'], msg.as_string())
server.quit()