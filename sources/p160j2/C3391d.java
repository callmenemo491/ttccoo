package p160j2;

/* renamed from: j2.d */
/* loaded from: classes.dex */
public class C3391d {

    /* renamed from: a */
    public final byte[] f14567a;

    /* renamed from: b */
    public java.nio.ByteBuffer f14568b;

    /* renamed from: c */
    public p160j2.C3390c f14569c;

    /* renamed from: d */
    public int f14570d;

    public C3391d() {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r1.f14567a = r0
            r0 = 0
            r1.f14570d = r0
            return
    }

    /* renamed from: a */
    public final boolean m7765a() {
            r1 = this;
            j2.c r0 = r1.f14569c
            int r0 = r0.f14557b
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* renamed from: b */
    public p160j2.C3390c m7766b() {
            r9 = this;
            java.nio.ByteBuffer r0 = r9.f14568b
            if (r0 == 0) goto L1f3
            boolean r0 = r9.m7765a()
            if (r0 == 0) goto Ld
            j2.c r0 = r9.f14569c
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
        L14:
            r3 = 6
            if (r2 >= r3) goto L22
            int r3 = r9.m7767c()
            char r3 = (char) r3
            r0.append(r3)
            int r2 = r2 + 1
            goto L14
        L22:
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "GIF"
            boolean r0 = r0.startsWith(r2)
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = 1
            if (r0 != 0) goto L36
            j2.c r0 = r9.f14569c
            r0.f14557b = r4
            goto L90
        L36:
            j2.c r0 = r9.f14569c
            int r5 = r9.m7770f()
            r0.f14561f = r5
            j2.c r0 = r9.f14569c
            int r5 = r9.m7770f()
            r0.f14562g = r5
            int r0 = r9.m7767c()
            j2.c r5 = r9.f14569c
            r6 = r0 & 128(0x80, float:1.8E-43)
            if (r6 == 0) goto L52
            r6 = 1
            goto L53
        L52:
            r6 = 0
        L53:
            r5.f14563h = r6
            r0 = r0 & 7
            int r0 = r0 + r4
            double r6 = (double) r0
            double r6 = java.lang.Math.pow(r2, r6)
            int r0 = (int) r6
            r5.f14564i = r0
            j2.c r0 = r9.f14569c
            int r5 = r9.m7767c()
            r0.f14565j = r5
            j2.c r0 = r9.f14569c
            r9.m7767c()
            java.util.Objects.requireNonNull(r0)
            j2.c r0 = r9.f14569c
            boolean r0 = r0.f14563h
            if (r0 == 0) goto L90
            boolean r0 = r9.m7765a()
            if (r0 != 0) goto L90
            j2.c r0 = r9.f14569c
            int r5 = r0.f14564i
            int[] r5 = r9.m7769e(r5)
            r0.f14556a = r5
            j2.c r0 = r9.f14569c
            int[] r5 = r0.f14556a
            int r6 = r0.f14565j
            r5 = r5[r6]
            r0.f14566k = r5
        L90:
            boolean r0 = r9.m7765a()
            if (r0 != 0) goto L1f0
            r0 = 0
        L97:
            if (r0 != 0) goto L1e8
            boolean r5 = r9.m7765a()
            if (r5 != 0) goto L1e8
            j2.c r5 = r9.f14569c
            int r5 = r5.f14558c
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 > r6) goto L1e8
            int r5 = r9.m7767c()
            r6 = 33
            if (r5 == r6) goto L149
            r6 = 44
            if (r5 == r6) goto Lbf
            r6 = 59
            if (r5 == r6) goto Lbd
            j2.c r5 = r9.f14569c
            r5.f14557b = r4
            goto L97
        Lbd:
            r0 = 1
            goto L97
        Lbf:
            j2.c r5 = r9.f14569c
            j2.b r6 = r5.f14559d
            if (r6 != 0) goto Lcc
            j2.b r6 = new j2.b
            r6.<init>()
            r5.f14559d = r6
        Lcc:
            j2.b r5 = r5.f14559d
            int r6 = r9.m7770f()
            r5.f14545a = r6
            j2.c r5 = r9.f14569c
            j2.b r5 = r5.f14559d
            int r6 = r9.m7770f()
            r5.f14546b = r6
            j2.c r5 = r9.f14569c
            j2.b r5 = r5.f14559d
            int r6 = r9.m7770f()
            r5.f14547c = r6
            j2.c r5 = r9.f14569c
            j2.b r5 = r5.f14559d
            int r6 = r9.m7770f()
            r5.f14548d = r6
            int r5 = r9.m7767c()
            r6 = r5 & 128(0x80, float:1.8E-43)
            if (r6 == 0) goto Lfc
            r6 = 1
            goto Lfd
        Lfc:
            r6 = 0
        Lfd:
            r7 = r5 & 7
            int r7 = r7 + r4
            double r7 = (double) r7
            double r7 = java.lang.Math.pow(r2, r7)
            int r7 = (int) r7
            j2.c r8 = r9.f14569c
            j2.b r8 = r8.f14559d
            r5 = r5 & 64
            if (r5 == 0) goto L110
            r5 = 1
            goto L111
        L110:
            r5 = 0
        L111:
            r8.f14549e = r5
            if (r6 == 0) goto L11c
            int[] r5 = r9.m7769e(r7)
            r8.f14555k = r5
            goto L11f
        L11c:
            r5 = 0
            r8.f14555k = r5
        L11f:
            j2.c r5 = r9.f14569c
            j2.b r5 = r5.f14559d
            java.nio.ByteBuffer r6 = r9.f14568b
            int r6 = r6.position()
            r5.f14554j = r6
            r9.m7767c()
            r9.m7771g()
            boolean r5 = r9.m7765a()
            if (r5 == 0) goto L139
            goto L97
        L139:
            j2.c r5 = r9.f14569c
            int r6 = r5.f14558c
            int r6 = r6 + r4
            r5.f14558c = r6
            java.util.List<j2.b> r6 = r5.f14560e
            j2.b r5 = r5.f14559d
            r6.add(r5)
            goto L97
        L149:
            int r5 = r9.m7767c()
            if (r5 == r4) goto L1e3
            r6 = 249(0xf9, float:3.49E-43)
            r7 = 2
            if (r5 == r6) goto L1a0
            r6 = 254(0xfe, float:3.56E-43)
            if (r5 == r6) goto L1e3
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == r6) goto L15e
            goto L1e3
        L15e:
            r9.m7768d()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 0
        L167:
            r8 = 11
            if (r6 >= r8) goto L176
            byte[] r8 = r9.f14567a
            r8 = r8[r6]
            char r8 = (char) r8
            r5.append(r8)
            int r6 = r6 + 1
            goto L167
        L176:
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "NETSCAPE2.0"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L1e3
        L182:
            r9.m7768d()
            byte[] r5 = r9.f14567a
            r6 = r5[r1]
            if (r6 != r4) goto L194
            r6 = r5[r4]
            r5 = r5[r7]
            j2.c r5 = r9.f14569c
            java.util.Objects.requireNonNull(r5)
        L194:
            int r5 = r9.f14570d
            if (r5 <= 0) goto L97
            boolean r5 = r9.m7765a()
            if (r5 == 0) goto L182
            goto L97
        L1a0:
            j2.c r5 = r9.f14569c
            j2.b r6 = new j2.b
            r6.<init>()
            r5.f14559d = r6
            r9.m7767c()
            int r5 = r9.m7767c()
            j2.c r6 = r9.f14569c
            j2.b r6 = r6.f14559d
            r8 = r5 & 28
            int r8 = r8 >> r7
            r6.f14551g = r8
            if (r8 != 0) goto L1bd
            r6.f14551g = r4
        L1bd:
            r5 = r5 & 1
            if (r5 == 0) goto L1c3
            r5 = 1
            goto L1c4
        L1c3:
            r5 = 0
        L1c4:
            r6.f14550f = r5
            int r5 = r9.m7770f()
            r6 = 10
            if (r5 >= r7) goto L1d0
            r5 = 10
        L1d0:
            j2.c r7 = r9.f14569c
            j2.b r7 = r7.f14559d
            int r5 = r5 * 10
            r7.f14553i = r5
            int r5 = r9.m7767c()
            r7.f14552h = r5
            r9.m7767c()
            goto L97
        L1e3:
            r9.m7771g()
            goto L97
        L1e8:
            j2.c r0 = r9.f14569c
            int r1 = r0.f14558c
            if (r1 >= 0) goto L1f0
            r0.f14557b = r4
        L1f0:
            j2.c r0 = r9.f14569c
            return r0
        L1f3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must call setData() before parseHeader()"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: c */
    public final int m7767c() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f14568b     // Catch: java.lang.Exception -> L9
            byte r0 = r0.get()     // Catch: java.lang.Exception -> L9
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto Lf
        L9:
            j2.c r0 = r2.f14569c
            r1 = 1
            r0.f14557b = r1
            r0 = 0
        Lf:
            return r0
    }

    /* renamed from: d */
    public final void m7768d() {
            r7 = this;
            int r0 = r7.m7767c()
            r7.f14570d = r0
            if (r0 <= 0) goto L3d
            r0 = 0
            r1 = 0
        La:
            int r1 = r7.f14570d     // Catch: java.lang.Exception -> L18
            if (r0 >= r1) goto L3d
            int r1 = r1 - r0
            java.nio.ByteBuffer r2 = r7.f14568b     // Catch: java.lang.Exception -> L18
            byte[] r3 = r7.f14567a     // Catch: java.lang.Exception -> L18
            r2.get(r3, r0, r1)     // Catch: java.lang.Exception -> L18
            int r0 = r0 + r1
            goto La
        L18:
            r2 = move-exception
            r3 = 3
            java.lang.String r4 = "GifHeaderParser"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L38
            java.lang.String r3 = "Error Reading Block n: "
            java.lang.String r5 = " count: "
            java.lang.String r6 = " blockSize: "
            java.lang.StringBuilder r0 = androidx.recyclerview.widget.C0608s.m2117a(r3, r0, r5, r1, r6)
            int r1 = r7.f14570d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0, r2)
        L38:
            j2.c r0 = r7.f14569c
            r1 = 1
            r0.f14557b = r1
        L3d:
            return
    }

    /* renamed from: e */
    public final int[] m7769e(int r10) {
            r9 = this;
            int r0 = r10 * 3
            byte[] r0 = new byte[r0]
            r1 = 0
            java.nio.ByteBuffer r2 = r9.f14568b     // Catch: java.nio.BufferUnderflowException -> L34
            r2.get(r0)     // Catch: java.nio.BufferUnderflowException -> L34
            r2 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r2]     // Catch: java.nio.BufferUnderflowException -> L34
            r2 = 0
            r3 = 0
        L10:
            if (r2 >= r10) goto L48
            int r4 = r3 + 1
            r3 = r0[r3]     // Catch: java.nio.BufferUnderflowException -> L34
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r4 + 1
            r4 = r0[r4]     // Catch: java.nio.BufferUnderflowException -> L34
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r5 + 1
            r5 = r0[r5]     // Catch: java.nio.BufferUnderflowException -> L34
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r7 = r2 + 1
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r3 = r3 << 16
            r3 = r3 | r8
            int r4 = r4 << 8
            r3 = r3 | r4
            r3 = r3 | r5
            r1[r2] = r3     // Catch: java.nio.BufferUnderflowException -> L34
            r3 = r6
            r2 = r7
            goto L10
        L34:
            r10 = move-exception
            java.lang.String r0 = "GifHeaderParser"
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L43
            java.lang.String r2 = "Format Error Reading Color Table"
            android.util.Log.d(r0, r2, r10)
        L43:
            j2.c r10 = r9.f14569c
            r0 = 1
            r10.f14557b = r0
        L48:
            return r1
    }

    /* renamed from: f */
    public final int m7770f() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f14568b
            short r0 = r0.getShort()
            return r0
    }

    /* renamed from: g */
    public final void m7771g() {
            r3 = this;
        L0:
            int r0 = r3.m7767c()
            java.nio.ByteBuffer r1 = r3.f14568b
            int r1 = r1.position()
            int r1 = r1 + r0
            java.nio.ByteBuffer r2 = r3.f14568b
            int r2 = r2.limit()
            int r1 = java.lang.Math.min(r1, r2)
            java.nio.ByteBuffer r2 = r3.f14568b
            r2.position(r1)
            if (r0 > 0) goto L0
            return
    }
}
