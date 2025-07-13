package p249o7;

/* renamed from: o7.j3 */
/* loaded from: classes.dex */
public final class RunnableC5025j3 implements java.lang.Runnable {

    /* renamed from: Y */
    public final java.net.URL f19778Y;

    /* renamed from: Z */
    public final byte[] f19779Z;

    /* renamed from: a0 */
    public final p249o7.InterfaceC5017i3 f19780a0;

    /* renamed from: b0 */
    public final java.lang.String f19781b0;

    /* renamed from: c0 */
    public final java.util.Map<java.lang.String, java.lang.String> f19782c0;

    /* renamed from: d0 */
    public final /* synthetic */ p249o7.C5033k3 f19783d0;

    public RunnableC5025j3(p249o7.C5033k3 r1, java.lang.String r2, java.net.URL r3, byte[] r4, java.util.Map<java.lang.String, java.lang.String> r5, p249o7.InterfaceC5017i3 r6) {
            r0 = this;
            r0.f19783d0 = r1
            r0.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r0.f19778Y = r3
            r0.f19779Z = r4
            r0.f19780a0 = r6
            r0.f19781b0 = r2
            r0.f19782c0 = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            o7.k3 r1 = r12.f19783d0
            r1.mo3182h()
            r1 = 0
            r2 = 0
            o7.k3 r3 = r12.f19783d0     // Catch: java.lang.Throwable -> Le4 java.io.IOException -> L120
            java.net.URL r4 = r12.f19778Y     // Catch: java.lang.Throwable -> Le4 java.io.IOException -> L120
            java.net.HttpURLConnection r3 = r3.m11287m(r4)     // Catch: java.lang.Throwable -> Le4 java.io.IOException -> L120
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.f19782c0     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            if (r4 == 0) goto L39
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
        L1d:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            if (r5 == 0) goto L39
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            r3.addRequestProperty(r6, r5)     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            goto L1d
        L39:
            byte[] r4 = r12.f19779Z     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            if (r4 == 0) goto L87
            o7.k3 r4 = r12.f19783d0     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            o7.m6 r4 = r4.f19756b     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            o7.o6 r4 = r4.f19866g     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            p249o7.C5052m6.m11327I(r4)     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            byte[] r5 = r12.f19779Z     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            byte[] r4 = r4.m11405P(r5)     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            o7.k3 r5 = r12.f19783d0     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            o7.f3 r5 = r5.f5680n     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            int r6 = r4.length     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            java.lang.String r7 = "Uploading data. size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            r5.m11170d(r7, r8)     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            r5 = 1
            r3.setDoOutput(r5)     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r3.addRequestProperty(r5, r7)     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            r3.setFixedLengthStreamingMode(r6)     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            r3.connect()     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            r5.write(r4)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L81
            r5.close()     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L81
            goto L87
        L7c:
            r4 = move-exception
            r11 = r2
            r2 = r5
            goto Le8
        L81:
            r4 = move-exception
            r11 = r2
            r9 = r4
            r2 = r5
            goto L125
        L87:
            int r8 = r3.getResponseCode()     // Catch: java.lang.Throwable -> Lde java.io.IOException -> Le1
            java.util.Map r11 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> Ld7 java.io.IOException -> Lda
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lc9
            r4.<init>()     // Catch: java.lang.Throwable -> Lc9
            java.io.InputStream r5 = r3.getInputStream()     // Catch: java.lang.Throwable -> Lc9
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> Lc7
        L9c:
            int r7 = r5.read(r6)     // Catch: java.lang.Throwable -> Lc7
            if (r7 <= 0) goto La6
            r4.write(r6, r1, r7)     // Catch: java.lang.Throwable -> Lc7
            goto L9c
        La6:
            byte[] r10 = r4.toByteArray()     // Catch: java.lang.Throwable -> Lc7
            r5.close()     // Catch: java.lang.Throwable -> Ld1 java.io.IOException -> Ld4
            r3.disconnect()
            o7.k3 r0 = r12.f19783d0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.e3 r1 = new o7.e3
            java.lang.String r6 = r12.f19781b0
            o7.i3 r7 = r12.f19780a0
            r9 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        Lc3:
            r0.m11176s(r1)
            return
        Lc7:
            r1 = move-exception
            goto Lcb
        Lc9:
            r1 = move-exception
            r5 = r2
        Lcb:
            if (r5 == 0) goto Ld0
            r5.close()     // Catch: java.lang.Throwable -> Ld1 java.io.IOException -> Ld4
        Ld0:
            throw r1     // Catch: java.lang.Throwable -> Ld1 java.io.IOException -> Ld4
        Ld1:
            r1 = move-exception
            r4 = r1
            goto Le9
        Ld4:
            r1 = move-exception
            r4 = r1
            goto Ldc
        Ld7:
            r4 = move-exception
            r11 = r2
            goto Le9
        Lda:
            r4 = move-exception
            r11 = r2
        Ldc:
            r9 = r4
            goto L126
        Lde:
            r4 = move-exception
            r11 = r2
            goto Le8
        Le1:
            r4 = move-exception
            r11 = r2
            goto L124
        Le4:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r11 = r3
        Le8:
            r8 = 0
        Le9:
            if (r2 == 0) goto L103
            r2.close()     // Catch: java.io.IOException -> Lef
            goto L103
        Lef:
            r1 = move-exception
            o7.k3 r2 = r12.f19783d0
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r5 = r12.f19781b0
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r5)
            r2.m11171e(r0, r5, r1)
        L103:
            if (r3 == 0) goto L108
            r3.disconnect()
        L108:
            o7.k3 r0 = r12.f19783d0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.e3 r1 = new o7.e3
            java.lang.String r6 = r12.f19781b0
            o7.i3 r7 = r12.f19780a0
            r9 = 0
            r10 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.m11176s(r1)
            throw r4
        L120:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r11 = r3
        L124:
            r9 = r4
        L125:
            r8 = 0
        L126:
            if (r2 == 0) goto L140
            r2.close()     // Catch: java.io.IOException -> L12c
            goto L140
        L12c:
            r1 = move-exception
            o7.k3 r2 = r12.f19783d0
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r4 = r12.f19781b0
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r4)
            r2.m11171e(r0, r4, r1)
        L140:
            if (r3 == 0) goto L145
            r3.disconnect()
        L145:
            o7.k3 r0 = r12.f19783d0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.e3 r1 = new o7.e3
            java.lang.String r6 = r12.f19781b0
            o7.i3 r7 = r12.f19780a0
            r10 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto Lc3
    }
}
