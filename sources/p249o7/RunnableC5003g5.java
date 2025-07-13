package p249o7;

/* renamed from: o7.g5 */
/* loaded from: classes.dex */
public final class RunnableC5003g5 implements java.lang.Runnable {

    /* renamed from: Y */
    public final java.net.URL f19705Y;

    /* renamed from: Z */
    public final /* synthetic */ p249o7.C5011h5 f19706Z;

    /* renamed from: a0 */
    public final com.google.android.gms.measurement.internal.C1114e f19707a0;

    public RunnableC5003g5(p249o7.C5011h5 r1, java.lang.String r2, java.net.URL r3, com.google.android.gms.measurement.internal.C1114e r4) {
            r0 = this;
            r0.f19706Z = r1
            r0.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r0.f19705Y = r3
            r0.f19707a0 = r4
            return
    }

    /* renamed from: a */
    public final void m11192a(int r9, java.lang.Exception r10, byte[] r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) {
            r8 = this;
            o7.h5 r0 = r8.f19706Z
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.f5 r7 = new o7.f5
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.m11176s(r7)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            o7.h5 r0 = r9.f19706Z
            r0.mo3182h()
            r0 = 0
            r1 = 0
            o7.h5 r2 = r9.f19706Z     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L68
            java.net.URL r3 = r9.f19705Y     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L68
            java.net.HttpURLConnection r2 = r2.m11246p(r3)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L68
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L55
            java.util.Map r4 = r2.getHeaderFields()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.io.InputStream r6 = r2.getInputStream()     // Catch: java.lang.Throwable -> L3e
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L3c
        L24:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L3c
            if (r8 <= 0) goto L2e
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L3c
            goto L24
        L2e:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L3c
            r6.close()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r2.disconnect()
            r9.m11192a(r3, r1, r0, r4)
            return
        L3c:
            r0 = move-exception
            goto L40
        L3e:
            r0 = move-exception
            r6 = r1
        L40:
            if (r6 == 0) goto L45
            r6.close()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
        L45:
            throw r0     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
        L46:
            r0 = move-exception
            goto L5f
        L48:
            r0 = move-exception
            goto L6d
        L4a:
            r0 = move-exception
            r4 = r1
            goto L5f
        L4d:
            r0 = move-exception
            r4 = r1
            goto L6d
        L50:
            r3 = move-exception
            r4 = r1
            r0 = r3
            r3 = 0
            goto L5f
        L55:
            r3 = move-exception
            r4 = r1
            r0 = r3
            r3 = 0
            goto L6d
        L5a:
            r2 = move-exception
            r4 = r1
            r0 = r2
            r3 = 0
            r2 = r4
        L5f:
            if (r2 == 0) goto L64
            r2.disconnect()
        L64:
            r9.m11192a(r3, r1, r1, r4)
            throw r0
        L68:
            r2 = move-exception
            r4 = r1
            r0 = r2
            r3 = 0
            r2 = r4
        L6d:
            if (r2 == 0) goto L72
            r2.disconnect()
        L72:
            r9.m11192a(r3, r0, r1, r4)
            return
    }
}
