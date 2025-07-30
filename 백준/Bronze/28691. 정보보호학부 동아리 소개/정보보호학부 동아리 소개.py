dongari = input()

li = {"MatKor", "WiCys", "CyKor", "AlKor", "$clear"}

for st in li:
    if st.startswith(dongari):
        print(st)
        break