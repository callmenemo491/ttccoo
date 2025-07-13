package p213m1;

/* renamed from: m1.b */
/* loaded from: classes.dex */
public class C4316b {
    /* renamed from: a */
    public static int m9644a(android.database.Cursor r8, java.lang.String r9) {
            int r0 = r8.getColumnIndex(r9)
            if (r0 < 0) goto L7
            goto L6c
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "`"
            r0.append(r1)
            r0.append(r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r0 = r8.getColumnIndex(r0)
            if (r0 < 0) goto L22
            goto L6c
        L22:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 25
            if (r0 <= r2) goto L29
            goto L6b
        L29:
            int r0 = r9.length()
            if (r0 != 0) goto L30
            goto L6b
        L30:
            java.lang.String[] r0 = r8.getColumnNames()
            java.lang.String r2 = "."
            java.lang.String r3 = p064e.C1493g.m4049a(r2, r9)
            java.lang.String r1 = android.support.v4.media.C0145d.m257a(r2, r9, r1)
            r2 = 0
            r4 = 0
        L40:
            int r5 = r0.length
            if (r4 >= r5) goto L6b
            r5 = r0[r4]
            int r6 = r5.length()
            int r7 = r9.length()
            int r7 = r7 + 2
            if (r6 < r7) goto L68
            boolean r6 = r5.endsWith(r3)
            if (r6 == 0) goto L58
            goto L66
        L58:
            char r6 = r5.charAt(r2)
            r7 = 96
            if (r6 != r7) goto L68
            boolean r5 = r5.endsWith(r1)
            if (r5 == 0) goto L68
        L66:
            r0 = r4
            goto L6c
        L68:
            int r4 = r4 + 1
            goto L40
        L6b:
            r0 = -1
        L6c:
            if (r0 < 0) goto L6f
            return r0
        L6f:
            java.lang.String[] r8 = r8.getColumnNames()     // Catch: java.lang.Exception -> L78
            java.lang.String r8 = java.util.Arrays.toString(r8)     // Catch: java.lang.Exception -> L78
            goto L82
        L78:
            r8 = move-exception
            java.lang.String r0 = "RoomCursorUtil"
            java.lang.String r1 = "Cannot collect column names for debug purposes"
            android.util.Log.d(r0, r1, r8)
            java.lang.String r8 = ""
        L82:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "column '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = "' does not exist. Available columns: "
            r1.append(r9)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }
}
