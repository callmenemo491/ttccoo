package p370v4;

/* renamed from: v4.v */
/* loaded from: classes.dex */
public final class C6544v {

    /* renamed from: a */
    public final p371v5.C6576z f25588a;

    /* renamed from: b */
    public final p371v5.C6571u f25589b;

    /* renamed from: c */
    public boolean f25590c;

    /* renamed from: d */
    public boolean f25591d;

    /* renamed from: e */
    public boolean f25592e;

    /* renamed from: f */
    public long f25593f;

    /* renamed from: g */
    public long f25594g;

    /* renamed from: h */
    public long f25595h;

    public C6544v() {
            r3 = this;
            r3.<init>()
            v5.z r0 = new v5.z
            r1 = 0
            r0.<init>(r1)
            r3.f25588a = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f25593f = r0
            r3.f25594g = r0
            r3.f25595h = r0
            v5.u r0 = new v5.u
            r0.<init>()
            r3.f25589b = r0
            return
    }

    /* renamed from: c */
    public static long m13283c(p371v5.C6571u r17) {
            r0 = r17
            int r1 = r0.f25711b
            int r2 = r17.m13398a()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 9
            if (r2 >= r5) goto L12
            return r3
        L12:
            byte[] r2 = new byte[r5]
            byte[] r6 = r0.f25710a
            int r7 = r0.f25711b
            r8 = 0
            java.lang.System.arraycopy(r6, r7, r2, r8, r5)
            int r6 = r0.f25711b
            int r6 = r6 + r5
            r0.f25711b = r6
            r0.m13396F(r1)
            r0 = r2[r8]
            r0 = r0 & 196(0xc4, float:2.75E-43)
            r1 = 68
            r5 = 3
            r6 = 5
            r7 = 4
            r9 = 2
            r10 = 1
            if (r0 == r1) goto L32
            goto L4d
        L32:
            r0 = r2[r9]
            r0 = r0 & r7
            if (r0 == r7) goto L38
            goto L4d
        L38:
            r0 = r2[r7]
            r0 = r0 & r7
            if (r0 == r7) goto L3e
            goto L4d
        L3e:
            r0 = r2[r6]
            r0 = r0 & r10
            if (r0 == r10) goto L44
            goto L4d
        L44:
            r0 = 8
            r0 = r2[r0]
            r0 = r0 & r5
            if (r0 != r5) goto L4d
            r0 = 1
            goto L4e
        L4d:
            r0 = 0
        L4e:
            if (r0 != 0) goto L51
            return r3
        L51:
            r0 = r2[r8]
            long r0 = (long) r0
            r3 = 56
            long r0 = r0 & r3
            long r0 = r0 >> r5
            r3 = 30
            long r0 = r0 << r3
            r3 = r2[r8]
            long r3 = (long) r3
            r11 = 3
            long r3 = r3 & r11
            r8 = 28
            long r3 = r3 << r8
            long r0 = r0 | r3
            r3 = r2[r10]
            long r3 = (long) r3
            r13 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r13
            r8 = 20
            long r3 = r3 << r8
            long r0 = r0 | r3
            r3 = r2[r9]
            long r3 = (long) r3
            r15 = 248(0xf8, double:1.225E-321)
            long r3 = r3 & r15
            long r3 = r3 >> r5
            r8 = 15
            long r3 = r3 << r8
            long r0 = r0 | r3
            r3 = r2[r9]
            long r3 = (long) r3
            long r3 = r3 & r11
            r8 = 13
            long r3 = r3 << r8
            long r0 = r0 | r3
            r3 = r2[r5]
            long r3 = (long) r3
            long r3 = r3 & r13
            long r3 = r3 << r6
            long r0 = r0 | r3
            r2 = r2[r7]
            long r2 = (long) r2
            long r2 = r2 & r15
            long r2 = r2 >> r5
            long r0 = r0 | r2
            return r0
    }

    /* renamed from: a */
    public final int m13284a(p216m4.InterfaceC4365j r3) {
            r2 = this;
            v5.u r0 = r2.f25589b
            byte[] r1 = p371v5.C6552b0.f25629f
            r0.m13393C(r1)
            r0 = 1
            r2.f25590c = r0
            r3.mo9790h()
            r3 = 0
            return r3
    }

    /* renamed from: b */
    public final int m13285b(byte[] r3, int r4) {
            r2 = this;
            r0 = r3[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r1 = r4 + 1
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r4 + 2
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r4 = r4 + 3
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r0
            return r3
    }
}
