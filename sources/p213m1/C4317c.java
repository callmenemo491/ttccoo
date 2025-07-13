package p213m1;

/* renamed from: m1.c */
/* loaded from: classes.dex */
public class C4317c {
    /* renamed from: a */
    public static android.database.Cursor m9645a(p179k1.AbstractC3664v r3, p243o1.InterfaceC4875e r4, boolean r5, android.os.CancellationSignal r6) {
            r6 = 0
            android.database.Cursor r3 = r3.m8115l(r4, r6)
            if (r5 == 0) goto L98
            boolean r4 = r3 instanceof android.database.AbstractWindowedCursor
            if (r4 == 0) goto L98
            r4 = r3
            android.database.AbstractWindowedCursor r4 = (android.database.AbstractWindowedCursor) r4
            int r5 = r4.getCount()
            boolean r0 = r4.hasWindow()
            if (r0 == 0) goto L21
            android.database.CursorWindow r0 = r4.getWindow()
            int r0 = r0.getNumRows()
            goto L22
        L21:
            r0 = r5
        L22:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L2a
            if (r0 >= r5) goto L98
        L2a:
            android.database.MatrixCursor r3 = new android.database.MatrixCursor     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r5 = r4.getColumnNames()     // Catch: java.lang.Throwable -> L93
            int r0 = r4.getCount()     // Catch: java.lang.Throwable -> L93
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L93
        L37:
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L93
            if (r5 == 0) goto L8f
            int r5 = r4.getColumnCount()     // Catch: java.lang.Throwable -> L93
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L93
            r0 = 0
        L44:
            int r1 = r4.getColumnCount()     // Catch: java.lang.Throwable -> L93
            if (r0 >= r1) goto L8b
            int r1 = r4.getType(r0)     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L86
            r2 = 1
            if (r1 == r2) goto L7b
            r2 = 2
            if (r1 == r2) goto L70
            r2 = 3
            if (r1 == r2) goto L69
            r2 = 4
            if (r1 != r2) goto L63
            byte[] r1 = r4.getBlob(r0)     // Catch: java.lang.Throwable -> L93
            r5[r0] = r1     // Catch: java.lang.Throwable -> L93
            goto L88
        L63:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L93
            r3.<init>()     // Catch: java.lang.Throwable -> L93
            throw r3     // Catch: java.lang.Throwable -> L93
        L69:
            java.lang.String r1 = r4.getString(r0)     // Catch: java.lang.Throwable -> L93
            r5[r0] = r1     // Catch: java.lang.Throwable -> L93
            goto L88
        L70:
            double r1 = r4.getDouble(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.Throwable -> L93
            r5[r0] = r1     // Catch: java.lang.Throwable -> L93
            goto L88
        L7b:
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L93
            r5[r0] = r1     // Catch: java.lang.Throwable -> L93
            goto L88
        L86:
            r5[r0] = r6     // Catch: java.lang.Throwable -> L93
        L88:
            int r0 = r0 + 1
            goto L44
        L8b:
            r3.addRow(r5)     // Catch: java.lang.Throwable -> L93
            goto L37
        L8f:
            r4.close()
            return r3
        L93:
            r3 = move-exception
            r4.close()
            throw r3
        L98:
            return r3
    }

    /* renamed from: b */
    public static int m9646b(java.io.File r10) {
            r0 = 4
            r1 = 0
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.lang.Throwable -> L36
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L36
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L36
            java.nio.channels.FileChannel r1 = r3.getChannel()     // Catch: java.lang.Throwable -> L36
            r5 = 60
            r7 = 4
            r9 = 1
            r4 = r1
            r4.tryLock(r5, r7, r9)     // Catch: java.lang.Throwable -> L36
            r3 = 60
            r1.position(r3)     // Catch: java.lang.Throwable -> L36
            int r10 = r1.read(r2)     // Catch: java.lang.Throwable -> L36
            if (r10 != r0) goto L2e
            r2.rewind()     // Catch: java.lang.Throwable -> L36
            int r10 = r2.getInt()     // Catch: java.lang.Throwable -> L36
            r1.close()
            return r10
        L2e:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "Bad database header, unable to read 4 bytes at offset 60"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L36
            throw r10     // Catch: java.lang.Throwable -> L36
        L36:
            r10 = move-exception
            if (r1 == 0) goto L3c
            r1.close()
        L3c:
            throw r10
    }
}
