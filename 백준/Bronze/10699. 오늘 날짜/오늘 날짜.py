from datetime import datetime, timedelta, timezone

korea_tz = timezone(timedelta(hours=9))
today_seoul = datetime.now(korea_tz).strftime("%Y-%m-%d")
print(today_seoul)
