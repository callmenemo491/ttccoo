package p371v5;

/* renamed from: v5.u */
/* loaded from: classes.dex */
public final class C6571u {

    /* renamed from: a */
    public byte[] f25710a;

    /* renamed from: b */
    public int f25711b;

    /* renamed from: c */
    public int f25712c;

    public C6571u() {
            r1 = this;
            r1.<init>()
            byte[] r0 = p371v5.C6552b0.f25629f
            r1.f25710a = r0
            return
    }

    public C6571u(int r2) {
            r1 = this;
            r1.<init>()
            byte[] r0 = new byte[r2]
            r1.f25710a = r0
            r1.f25712c = r2
            return
    }

    public C6571u(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.f25710a = r1
            int r1 = r1.length
            r0.f25712c = r1
            return
    }

    public C6571u(byte[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f25710a = r1
            r0.f25712c = r2
            return
    }

    /* renamed from: A */
    public long m13391A() {
            r12 = this;
            byte[] r0 = r12.f25710a
            int r1 = r12.f25711b
            r0 = r0[r1]
            long r0 = (long) r0
            r2 = 7
            r3 = 7
        L9:
            r4 = 6
            r5 = 1
            if (r3 < 0) goto L25
            int r6 = r5 << r3
            long r7 = (long) r6
            long r7 = r7 & r0
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L22
            if (r3 >= r4) goto L1e
            int r6 = r6 - r5
            long r6 = (long) r6
            long r0 = r0 & r6
            int r2 = r2 - r3
            goto L26
        L1e:
            if (r3 != r2) goto L25
            r2 = 1
            goto L26
        L22:
            int r3 = r3 + (-1)
            goto L9
        L25:
            r2 = 0
        L26:
            if (r2 == 0) goto L5e
        L28:
            if (r5 >= r2) goto L58
            byte[] r3 = r12.f25710a
            int r6 = r12.f25711b
            int r6 = r6 + r5
            r3 = r3[r6]
            r6 = r3 & 192(0xc0, float:2.69E-43)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 != r7) goto L3f
            long r0 = r0 << r4
            r3 = r3 & 63
            long r6 = (long) r3
            long r0 = r0 | r6
            int r5 = r5 + 1
            goto L28
        L3f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            r3 = 62
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Invalid UTF-8 sequence continuation byte: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        L58:
            int r3 = r12.f25711b
            int r3 = r3 + r2
            r12.f25711b = r3
            return r0
        L5e:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            r3 = 55
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Invalid UTF-8 sequence first byte: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: B */
    public void m13392B(int r3) {
            r2 = this;
            byte[] r0 = r2.f25710a
            int r1 = r0.length
            if (r1 >= r3) goto L7
            byte[] r0 = new byte[r3]
        L7:
            r2.m13394D(r0, r3)
            return
    }

    /* renamed from: C */
    public void m13393C(byte[] r2) {
            r1 = this;
            int r0 = r2.length
            r1.f25710a = r2
            r1.f25712c = r0
            r2 = 0
            r1.f25711b = r2
            return
    }

    /* renamed from: D */
    public void m13394D(byte[] r1, int r2) {
            r0 = this;
            r0.f25710a = r1
            r0.f25712c = r2
            r1 = 0
            r0.f25711b = r1
            return
    }

    /* renamed from: E */
    public void m13395E(int r2) {
            r1 = this;
            if (r2 < 0) goto L9
            byte[] r0 = r1.f25710a
            int r0 = r0.length
            if (r2 > r0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            p371v5.C6549a.m13288b(r0)
            r1.f25712c = r2
            return
    }

    /* renamed from: F */
    public void m13396F(int r2) {
            r1 = this;
            if (r2 < 0) goto L8
            int r0 = r1.f25712c
            if (r2 > r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            p371v5.C6549a.m13288b(r0)
            r1.f25711b = r2
            return
    }

    /* renamed from: G */
    public void m13397G(int r2) {
            r1 = this;
            int r0 = r1.f25711b
            int r0 = r0 + r2
            r1.m13396F(r0)
            return
    }

    /* renamed from: a */
    public int m13398a() {
            r2 = this;
            int r0 = r2.f25712c
            int r1 = r2.f25711b
            int r0 = r0 - r1
            return r0
    }

    /* renamed from: b */
    public void m13399b(int r3) {
            r2 = this;
            byte[] r0 = r2.f25710a
            int r1 = r0.length
            if (r3 <= r1) goto Lb
            byte[] r3 = java.util.Arrays.copyOf(r0, r3)
            r2.f25710a = r3
        Lb:
            return
    }

    /* renamed from: c */
    public int m13400c() {
            r2 = this;
            byte[] r0 = r2.f25710a
            int r1 = r2.f25711b
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    /* renamed from: d */
    public void m13401d(p216m4.C4355b0 r3, int r4) {
            r2 = this;
            java.lang.Object r0 = r3.f17870b
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2.m13402e(r0, r1, r4)
            r3.m9772q(r1)
            return
    }

    /* renamed from: e */
    public void m13402e(byte[] r3, int r4, int r5) {
            r2 = this;
            byte[] r0 = r2.f25710a
            int r1 = r2.f25711b
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.f25711b
            int r3 = r3 + r5
            r2.f25711b = r3
            return
    }

    /* renamed from: f */
    public int m13403f() {
            r4 = this;
            byte[] r0 = r4.f25710a
            int r1 = r4.f25711b
            int r2 = r1 + 1
            r4.f25711b = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            int r3 = r2 + 1
            r4.f25711b = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r2 = r3 + 1
            r4.f25711b = r2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r1 = r1 | r3
            int r3 = r2 + 1
            r4.f25711b = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
    }

    /* renamed from: g */
    public java.lang.String m13404g() {
            r9 = this;
            int r0 = r9.m13398a()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r9.f25711b
        La:
            int r1 = r9.f25712c
            r2 = 13
            r3 = 10
            r4 = 1
            if (r0 >= r1) goto L26
            byte[] r1 = r9.f25710a
            r1 = r1[r0]
            int r5 = p371v5.C6552b0.f25624a
            if (r1 == r3) goto L20
            if (r1 != r2) goto L1e
            goto L20
        L1e:
            r1 = 0
            goto L21
        L20:
            r1 = 1
        L21:
            if (r1 != 0) goto L26
            int r0 = r0 + 1
            goto La
        L26:
            int r1 = r9.f25711b
            int r5 = r0 - r1
            r6 = 3
            if (r5 < r6) goto L48
            byte[] r5 = r9.f25710a
            r7 = r5[r1]
            r8 = -17
            if (r7 != r8) goto L48
            int r7 = r1 + 1
            r7 = r5[r7]
            r8 = -69
            if (r7 != r8) goto L48
            int r7 = r1 + 2
            r5 = r5[r7]
            r7 = -65
            if (r5 != r7) goto L48
            int r1 = r1 + r6
            r9.f25711b = r1
        L48:
            byte[] r1 = r9.f25710a
            int r5 = r9.f25711b
            int r6 = r0 - r5
            java.lang.String r1 = p371v5.C6552b0.m13320m(r1, r5, r6)
            r9.f25711b = r0
            int r5 = r9.f25712c
            if (r0 != r5) goto L59
            return r1
        L59:
            byte[] r6 = r9.f25710a
            r7 = r6[r0]
            if (r7 != r2) goto L65
            int r0 = r0 + r4
            r9.f25711b = r0
            if (r0 != r5) goto L65
            return r1
        L65:
            int r0 = r9.f25711b
            r2 = r6[r0]
            if (r2 != r3) goto L6e
            int r0 = r0 + r4
            r9.f25711b = r0
        L6e:
            return r1
    }

    /* renamed from: h */
    public int m13405h() {
            r4 = this;
            byte[] r0 = r4.f25710a
            int r1 = r4.f25711b
            int r2 = r1 + 1
            r4.f25711b = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.f25711b = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r3 + 1
            r4.f25711b = r2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r1 = r1 | r3
            int r3 = r2 + 1
            r4.f25711b = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r0 = r0 | r1
            return r0
    }

    /* renamed from: i */
    public long m13406i() {
            r9 = this;
            byte[] r0 = r9.f25710a
            int r1 = r9.f25711b
            int r2 = r1 + 1
            r9.f25711b = r2
            r1 = r0[r1]
            long r3 = (long) r1
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            int r1 = r2 + 1
            r9.f25711b = r1
            r2 = r0[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 8
            long r7 = r7 << r2
            long r2 = r3 | r7
            int r4 = r1 + 1
            r9.f25711b = r4
            r1 = r0[r1]
            long r7 = (long) r1
            long r7 = r7 & r5
            r1 = 16
            long r7 = r7 << r1
            long r1 = r2 | r7
            int r3 = r4 + 1
            r9.f25711b = r3
            r4 = r0[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 24
            long r7 = r7 << r4
            long r1 = r1 | r7
            int r4 = r3 + 1
            r9.f25711b = r4
            r3 = r0[r3]
            long r7 = (long) r3
            long r7 = r7 & r5
            r3 = 32
            long r7 = r7 << r3
            long r1 = r1 | r7
            int r3 = r4 + 1
            r9.f25711b = r3
            r4 = r0[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 40
            long r7 = r7 << r4
            long r1 = r1 | r7
            int r4 = r3 + 1
            r9.f25711b = r4
            r3 = r0[r3]
            long r7 = (long) r3
            long r7 = r7 & r5
            r3 = 48
            long r7 = r7 << r3
            long r1 = r1 | r7
            int r3 = r4 + 1
            r9.f25711b = r3
            r0 = r0[r4]
            long r3 = (long) r0
            long r3 = r3 & r5
            r0 = 56
            long r3 = r3 << r0
            long r0 = r1 | r3
            return r0
    }

    /* renamed from: j */
    public short m13407j() {
            r4 = this;
            byte[] r0 = r4.f25710a
            int r1 = r4.f25711b
            int r2 = r1 + 1
            r4.f25711b = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.f25711b = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    /* renamed from: k */
    public long m13408k() {
            r9 = this;
            byte[] r0 = r9.f25710a
            int r1 = r9.f25711b
            int r2 = r1 + 1
            r9.f25711b = r2
            r1 = r0[r1]
            long r3 = (long) r1
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            int r1 = r2 + 1
            r9.f25711b = r1
            r2 = r0[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 8
            long r7 = r7 << r2
            long r2 = r3 | r7
            int r4 = r1 + 1
            r9.f25711b = r4
            r1 = r0[r1]
            long r7 = (long) r1
            long r7 = r7 & r5
            r1 = 16
            long r7 = r7 << r1
            long r1 = r2 | r7
            int r3 = r4 + 1
            r9.f25711b = r3
            r0 = r0[r4]
            long r3 = (long) r0
            long r3 = r3 & r5
            r0 = 24
            long r3 = r3 << r0
            long r0 = r1 | r3
            return r0
    }

    /* renamed from: l */
    public int m13409l() {
            r4 = this;
            int r0 = r4.m13405h()
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r2 = 29
            java.lang.String r3 = "Top bit not zero: "
            java.lang.String r0 = p064e.C1490d.m4039a(r2, r3, r0)
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: m */
    public int m13410m() {
            r4 = this;
            byte[] r0 = r4.f25710a
            int r1 = r4.f25711b
            int r2 = r1 + 1
            r4.f25711b = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.f25711b = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r1
            return r0
    }

    /* renamed from: n */
    public long m13411n() {
            r9 = this;
            byte[] r0 = r9.f25710a
            int r1 = r9.f25711b
            int r2 = r1 + 1
            r9.f25711b = r2
            r1 = r0[r1]
            long r3 = (long) r1
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            r1 = 56
            long r3 = r3 << r1
            int r1 = r2 + 1
            r9.f25711b = r1
            r2 = r0[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 48
            long r7 = r7 << r2
            long r2 = r3 | r7
            int r4 = r1 + 1
            r9.f25711b = r4
            r1 = r0[r1]
            long r7 = (long) r1
            long r7 = r7 & r5
            r1 = 40
            long r7 = r7 << r1
            long r1 = r2 | r7
            int r3 = r4 + 1
            r9.f25711b = r3
            r4 = r0[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 32
            long r7 = r7 << r4
            long r1 = r1 | r7
            int r4 = r3 + 1
            r9.f25711b = r4
            r3 = r0[r3]
            long r7 = (long) r3
            long r7 = r7 & r5
            r3 = 24
            long r7 = r7 << r3
            long r1 = r1 | r7
            int r3 = r4 + 1
            r9.f25711b = r3
            r4 = r0[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 16
            long r7 = r7 << r4
            long r1 = r1 | r7
            int r4 = r3 + 1
            r9.f25711b = r4
            r3 = r0[r3]
            long r7 = (long) r3
            long r7 = r7 & r5
            r3 = 8
            long r7 = r7 << r3
            long r1 = r1 | r7
            int r3 = r4 + 1
            r9.f25711b = r3
            r0 = r0[r4]
            long r3 = (long) r0
            long r3 = r3 & r5
            long r0 = r1 | r3
            return r0
    }

    /* renamed from: o */
    public java.lang.String m13412o() {
            r4 = this;
            int r0 = r4.m13398a()
            if (r0 != 0) goto L8
            r0 = 0
            goto L2c
        L8:
            int r0 = r4.f25711b
        La:
            int r1 = r4.f25712c
            if (r0 >= r1) goto L17
            byte[] r1 = r4.f25710a
            r1 = r1[r0]
            if (r1 == 0) goto L17
            int r0 = r0 + 1
            goto La
        L17:
            byte[] r1 = r4.f25710a
            int r2 = r4.f25711b
            int r3 = r0 - r2
            java.lang.String r1 = p371v5.C6552b0.m13320m(r1, r2, r3)
            r4.f25711b = r0
            int r2 = r4.f25712c
            if (r0 >= r2) goto L2b
            int r0 = r0 + 1
            r4.f25711b = r0
        L2b:
            r0 = r1
        L2c:
            return r0
    }

    /* renamed from: p */
    public java.lang.String m13413p(int r4) {
            r3 = this;
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            int r0 = r3.f25711b
            int r1 = r0 + r4
            int r1 = r1 + (-1)
            int r2 = r3.f25712c
            if (r1 >= r2) goto L18
            byte[] r2 = r3.f25710a
            r1 = r2[r1]
            if (r1 != 0) goto L18
            int r1 = r4 + (-1)
            goto L19
        L18:
            r1 = r4
        L19:
            byte[] r2 = r3.f25710a
            java.lang.String r0 = p371v5.C6552b0.m13320m(r2, r0, r1)
            int r1 = r3.f25711b
            int r1 = r1 + r4
            r3.f25711b = r1
            return r0
    }

    /* renamed from: q */
    public short m13414q() {
            r4 = this;
            byte[] r0 = r4.f25710a
            int r1 = r4.f25711b
            int r2 = r1 + 1
            r4.f25711b = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r3 = r2 + 1
            r4.f25711b = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    /* renamed from: r */
    public java.lang.String m13415r(int r2) {
            r1 = this;
            java.nio.charset.Charset r0 = p010a9.C0035c.f82c
            java.lang.String r2 = r1.m13416s(r2, r0)
            return r2
    }

    /* renamed from: s */
    public java.lang.String m13416s(int r4, java.nio.charset.Charset r5) {
            r3 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r3.f25710a
            int r2 = r3.f25711b
            r0.<init>(r1, r2, r4, r5)
            int r5 = r3.f25711b
            int r5 = r5 + r4
            r3.f25711b = r5
            return r0
    }

    /* renamed from: t */
    public int m13417t() {
            r4 = this;
            int r0 = r4.m13418u()
            int r1 = r4.m13418u()
            int r2 = r4.m13418u()
            int r3 = r4.m13418u()
            int r0 = r0 << 21
            int r1 = r1 << 14
            r0 = r0 | r1
            int r1 = r2 << 7
            r0 = r0 | r1
            r0 = r0 | r3
            return r0
    }

    /* renamed from: u */
    public int m13418u() {
            r3 = this;
            byte[] r0 = r3.f25710a
            int r1 = r3.f25711b
            int r2 = r1 + 1
            r3.f25711b = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    /* renamed from: v */
    public long m13419v() {
            r9 = this;
            byte[] r0 = r9.f25710a
            int r1 = r9.f25711b
            int r2 = r1 + 1
            r9.f25711b = r2
            r1 = r0[r1]
            long r3 = (long) r1
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            r1 = 24
            long r3 = r3 << r1
            int r1 = r2 + 1
            r9.f25711b = r1
            r2 = r0[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 16
            long r7 = r7 << r2
            long r2 = r3 | r7
            int r4 = r1 + 1
            r9.f25711b = r4
            r1 = r0[r1]
            long r7 = (long) r1
            long r7 = r7 & r5
            r1 = 8
            long r7 = r7 << r1
            long r1 = r2 | r7
            int r3 = r4 + 1
            r9.f25711b = r3
            r0 = r0[r4]
            long r3 = (long) r0
            long r3 = r3 & r5
            long r0 = r1 | r3
            return r0
    }

    /* renamed from: w */
    public int m13420w() {
            r4 = this;
            byte[] r0 = r4.f25710a
            int r1 = r4.f25711b
            int r2 = r1 + 1
            r4.f25711b = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            int r3 = r2 + 1
            r4.f25711b = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r3 + 1
            r4.f25711b = r2
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
    }

    /* renamed from: x */
    public int m13421x() {
            r4 = this;
            int r0 = r4.m13403f()
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r2 = 29
            java.lang.String r3 = "Top bit not zero: "
            java.lang.String r0 = p064e.C1490d.m4039a(r2, r3, r0)
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: y */
    public long m13422y() {
            r5 = this;
            long r0 = r5.m13411n()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r3 = 38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Top bit not zero: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: z */
    public int m13423z() {
            r4 = this;
            byte[] r0 = r4.f25710a
            int r1 = r4.f25711b
            int r2 = r1 + 1
            r4.f25711b = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r3 = r2 + 1
            r4.f25711b = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
    }
}
