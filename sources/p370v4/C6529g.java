package p370v4;

/* renamed from: v4.g */
/* loaded from: classes.dex */
public final class C6529g implements p370v4.InterfaceC6525d0.c {

    /* renamed from: a */
    public final int f25384a;

    /* renamed from: b */
    public final java.util.List<p088f4.C2003e0> f25385b;

    public C6529g(int r2) {
            r1 = this;
            b9.a<java.lang.Object> r0 = p026b9.AbstractC0714n.f3979Z
            b9.n<java.lang.Object> r0 = p026b9.C0693c0.f3898c0
            r1.<init>()
            r1.f25384a = r2
            r1.f25385b = r0
            return
    }

    @Override // p370v4.InterfaceC6525d0.c
    /* renamed from: a */
    public p370v4.InterfaceC6525d0 mo13252a(int r5, p370v4.InterfaceC6525d0.b r6) {
            r4 = this;
            r0 = 2
            if (r5 == r0) goto L124
            r1 = 3
            if (r5 == r1) goto L117
            r1 = 4
            if (r5 == r1) goto L117
            r2 = 21
            if (r5 == r2) goto L10c
            r2 = 27
            r3 = 0
            if (r5 == r2) goto Le6
            r1 = 36
            if (r5 == r1) goto Ld2
            r1 = 89
            if (r5 == r1) goto Lc5
            r1 = 138(0x8a, float:1.93E-43)
            if (r5 == r1) goto Lb8
            r1 = 172(0xac, float:2.41E-43)
            if (r5 == r1) goto Lab
            r1 = 257(0x101, float:3.6E-43)
            if (r5 == r1) goto L9e
            r1 = 134(0x86, float:1.88E-43)
            if (r5 == r1) goto L88
            r1 = 135(0x87, float:1.89E-43)
            if (r5 == r1) goto L7b
            switch(r5) {
                case 15: goto L5d;
                case 16: goto L49;
                case 17: goto L35;
                default: goto L31;
            }
        L31:
            switch(r5) {
                case 128: goto L124;
                case 129: goto L7b;
                case 130: goto L72;
                default: goto L34;
            }
        L34:
            return r3
        L35:
            boolean r5 = r4.m13265d(r0)
            if (r5 == 0) goto L3c
            goto L48
        L3c:
            v4.t r3 = new v4.t
            v4.p r5 = new v4.p
            java.lang.String r6 = r6.f25340a
            r5.<init>(r6)
            r3.<init>(r5)
        L48:
            return r3
        L49:
            v4.t r5 = new v4.t
            v4.l r0 = new v4.l
            v4.e0 r1 = new v4.e0
            java.util.List r6 = r4.m13264c(r6)
            r1.<init>(r6)
            r0.<init>(r1)
            r5.<init>(r0)
            return r5
        L5d:
            boolean r5 = r4.m13265d(r0)
            if (r5 == 0) goto L64
            goto L71
        L64:
            v4.t r3 = new v4.t
            v4.f r5 = new v4.f
            r0 = 0
            java.lang.String r6 = r6.f25340a
            r5.<init>(r0, r6)
            r3.<init>(r5)
        L71:
            return r3
        L72:
            r5 = 64
            boolean r5 = r4.m13265d(r5)
            if (r5 != 0) goto Lb8
            return r3
        L7b:
            v4.t r5 = new v4.t
            v4.b r0 = new v4.b
            java.lang.String r6 = r6.f25340a
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L88:
            r5 = 16
            boolean r5 = r4.m13265d(r5)
            if (r5 == 0) goto L91
            goto L9d
        L91:
            v4.y r3 = new v4.y
            v4.s r5 = new v4.s
            java.lang.String r6 = "application/x-scte35"
            r5.<init>(r6)
            r3.<init>(r5)
        L9d:
            return r3
        L9e:
            v4.y r5 = new v4.y
            v4.s r6 = new v4.s
            java.lang.String r0 = "application/vnd.dvb.ait"
            r6.<init>(r0)
            r5.<init>(r6)
            return r5
        Lab:
            v4.t r5 = new v4.t
            v4.d r0 = new v4.d
            java.lang.String r6 = r6.f25340a
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        Lb8:
            v4.t r5 = new v4.t
            v4.h r0 = new v4.h
            java.lang.String r6 = r6.f25340a
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        Lc5:
            v4.t r5 = new v4.t
            v4.i r0 = new v4.i
            java.util.List<v4.d0$a> r6 = r6.f25341b
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        Ld2:
            v4.t r5 = new v4.t
            v4.n r0 = new v4.n
            v4.z r1 = new v4.z
            java.util.List r6 = r4.m13264c(r6)
            r1.<init>(r6)
            r0.<init>(r1)
            r5.<init>(r0)
            return r5
        Le6:
            boolean r5 = r4.m13265d(r1)
            if (r5 == 0) goto Led
            goto L10b
        Led:
            v4.t r3 = new v4.t
            v4.m r5 = new v4.m
            v4.z r0 = new v4.z
            java.util.List r6 = r4.m13264c(r6)
            r0.<init>(r6)
            r6 = 1
            boolean r6 = r4.m13265d(r6)
            r1 = 8
            boolean r1 = r4.m13265d(r1)
            r5.<init>(r0, r6, r1)
            r3.<init>(r5)
        L10b:
            return r3
        L10c:
            v4.t r5 = new v4.t
            v4.o r6 = new v4.o
            r6.<init>()
            r5.<init>(r6)
            return r5
        L117:
            v4.t r5 = new v4.t
            v4.q r0 = new v4.q
            java.lang.String r6 = r6.f25340a
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L124:
            v4.t r5 = new v4.t
            v4.k r0 = new v4.k
            v4.e0 r1 = new v4.e0
            java.util.List r6 = r4.m13264c(r6)
            r1.<init>(r6)
            r0.<init>(r1)
            r5.<init>(r0)
            return r5
    }

    /* renamed from: b */
    public android.util.SparseArray<p370v4.InterfaceC6525d0> m13263b() {
            r1 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            return r0
    }

    /* renamed from: c */
    public final java.util.List<p088f4.C2003e0> m13264c(p370v4.InterfaceC6525d0.b r15) {
            r14 = this;
            r0 = 32
            boolean r0 = r14.m13265d(r0)
            if (r0 == 0) goto Lb
            java.util.List<f4.e0> r15 = r14.f25385b
            return r15
        Lb:
            byte[] r15 = r15.f25342c
            int r0 = r15.length
            java.util.List<f4.e0> r1 = r14.f25385b
            r2 = 0
            r3 = 0
        L12:
            int r4 = r0 - r3
            if (r4 <= 0) goto La7
            int r4 = r3 + 1
            r3 = r15[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r4 + 1
            r4 = r15[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r5
            r6 = 134(0x86, float:1.88E-43)
            r7 = 1
            if (r3 != r6) goto L9b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r5 + 1
            r5 = r15[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 & 31
            r6 = 0
        L36:
            if (r6 >= r5) goto L9b
            r8 = 3
            java.nio.charset.Charset r9 = p010a9.C0035c.f82c
            java.lang.String r10 = new java.lang.String
            r10.<init>(r15, r3, r8, r9)
            int r3 = r3 + r8
            int r8 = r3 + 1
            r3 = r15[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r9 = r3 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L4d
            r9 = 1
            goto L4e
        L4d:
            r9 = 0
        L4e:
            if (r9 == 0) goto L55
            r3 = r3 & 63
            java.lang.String r11 = "application/cea-708"
            goto L58
        L55:
            java.lang.String r11 = "application/cea-608"
            r3 = 1
        L58:
            int r12 = r8 + 1
            r8 = r15[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            int r12 = r12 + r7
            if (r12 < 0) goto L66
            if (r12 > r0) goto L66
            r13 = 1
            goto L67
        L66:
            r13 = 0
        L67:
            p371v5.C6549a.m13288b(r13)
            r13 = 0
            if (r9 == 0) goto L83
            r8 = r8 & 64
            if (r8 == 0) goto L73
            r8 = 1
            goto L74
        L73:
            r8 = 0
        L74:
            if (r8 == 0) goto L7b
            byte[] r8 = new byte[r7]
            r8[r2] = r7
            goto L7f
        L7b:
            byte[] r8 = new byte[r7]
            r8[r2] = r2
        L7f:
            java.util.List r13 = java.util.Collections.singletonList(r8)
        L83:
            f4.e0$b r8 = new f4.e0$b
            r8.<init>()
            r8.f8927k = r11
            r8.f8919c = r10
            r8.f8915C = r3
            r8.f8929m = r13
            f4.e0 r3 = r8.m5193a()
            r1.add(r3)
            int r6 = r6 + 1
            r3 = r12
            goto L36
        L9b:
            if (r4 < 0) goto La0
            if (r4 > r0) goto La0
            goto La1
        La0:
            r7 = 0
        La1:
            p371v5.C6549a.m13288b(r7)
            r3 = r4
            goto L12
        La7:
            return r1
    }

    /* renamed from: d */
    public final boolean m13265d(int r2) {
            r1 = this;
            int r0 = r1.f25384a
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }
}
