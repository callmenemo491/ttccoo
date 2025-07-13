package p124h7;

/* renamed from: h7.eg */
/* loaded from: classes.dex */
public final class C2610eg {

    /* renamed from: a */
    public final p124h7.C2592dg f11499a;

    /* renamed from: b */
    public int f11500b;

    /* renamed from: c */
    public int f11501c;

    /* renamed from: d */
    public int f11502d;

    public C2610eg(p124h7.C2592dg r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f11502d = r0
            java.nio.charset.Charset r0 = p124h7.C2575d.f11429a
            r1.f11499a = r2
            r2.f11469b = r1
            return
    }

    /* renamed from: s */
    public static final void m6648s(int r0) {
            r0 = r0 & 3
            if (r0 != 0) goto L5
            return
        L5:
            h7.f r0 = p124h7.C2611f.m6686f()
            throw r0
    }

    /* renamed from: t */
    public static final void m6649t(int r0) {
            r0 = r0 & 7
            if (r0 != 0) goto L5
            return
        L5:
            h7.f r0 = p124h7.C2611f.m6686f()
            throw r0
    }

    /* renamed from: A */
    public final java.lang.String m6650A() {
            r6 = this;
            r0 = 2
            r6.m6674r(r0)
            h7.dg r0 = r6.f11499a
            int r1 = r0.m6623d()
            if (r1 <= 0) goto L23
            int r2 = r0.f11471d
            int r3 = r0.f11473f
            int r2 = r2 - r3
            if (r1 <= r2) goto L14
            goto L23
        L14:
            java.lang.String r2 = new java.lang.String
            byte[] r4 = r0.f11470c
            java.nio.charset.Charset r5 = p124h7.C2575d.f11429a
            r2.<init>(r4, r3, r1, r5)
            int r3 = r0.f11473f
            int r3 = r3 + r1
            r0.f11473f = r3
            goto L27
        L23:
            if (r1 != 0) goto L28
            java.lang.String r2 = ""
        L27:
            return r2
        L28:
            if (r1 >= 0) goto L2f
            h7.f r0 = p124h7.C2611f.m6685e()
            throw r0
        L2f:
            h7.f r0 = p124h7.C2611f.m6687g()
            throw r0
    }

    /* renamed from: B */
    public final java.lang.String m6651B() {
            r4 = this;
            r0 = 2
            r4.m6674r(r0)
            h7.dg r0 = r4.f11499a
            int r1 = r0.m6623d()
            if (r1 <= 0) goto L20
            int r2 = r0.f11471d
            int r3 = r0.f11473f
            int r2 = r2 - r3
            if (r1 <= r2) goto L14
            goto L20
        L14:
            byte[] r2 = r0.f11470c
            java.lang.String r2 = p124h7.C2631g1.m6745d(r2, r3, r1)
            int r3 = r0.f11473f
            int r3 = r3 + r1
            r0.f11473f = r3
            goto L24
        L20:
            if (r1 != 0) goto L25
            java.lang.String r2 = ""
        L24:
            return r2
        L25:
            if (r1 > 0) goto L2c
            h7.f r0 = p124h7.C2611f.m6685e()
            throw r0
        L2c:
            h7.f r0 = p124h7.C2611f.m6687g()
            throw r0
    }

    /* renamed from: C */
    public final void m6652C(java.util.List<java.lang.Boolean> r3) {
            r2 = this;
            boolean r0 = r3 instanceof p124h7.C2933wf
            r1 = 2
            if (r0 == 0) goto L55
            r0 = r3
            h7.wf r0 = (p124h7.C2933wf) r0
            int r3 = r2.f11500b
            r3 = r3 & 7
            if (r3 == 0) goto L36
            if (r3 != r1) goto L2e
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            h7.dg r1 = r2.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r3
        L1b:
            h7.dg r3 = r2.f11499a
            boolean r3 = r3.m6631l()
            r0.m7240e(r3)
            h7.dg r3 = r2.f11499a
            int r3 = r3.f11473f
            if (r3 < r1) goto L1b
            r2.m6673q(r1)
            return
        L2e:
            int r3 = p124h7.C2611f.f11503Y
            h7.e r3 = new h7.e
            r3.<init>()
            throw r3
        L36:
            h7.dg r3 = r2.f11499a
            boolean r3 = r3.m6631l()
            r0.m7240e(r3)
            h7.dg r3 = r2.f11499a
            boolean r3 = r3.m6630k()
            if (r3 == 0) goto L48
            return
        L48:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6624e()
            int r1 = r2.f11500b
            if (r3 == r1) goto L36
            r2.f11502d = r3
            return
        L55:
            int r0 = r2.f11500b
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r1) goto L7f
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            h7.dg r1 = r2.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L68:
            h7.dg r0 = r2.f11499a
            boolean r0 = r0.m6631l()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.add(r0)
            h7.dg r0 = r2.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L68
            r2.m6673q(r1)
            return
        L7f:
            int r3 = p124h7.C2611f.f11503Y
            h7.e r3 = new h7.e
            r3.<init>()
            throw r3
        L87:
            h7.dg r0 = r2.f11499a
            boolean r0 = r0.m6631l()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.add(r0)
            h7.dg r0 = r2.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L9d
            return
        L9d:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6624e()
            int r1 = r2.f11500b
            if (r0 == r1) goto L87
            r2.f11502d = r0
            return
    }

    /* renamed from: D */
    public final void m6653D(java.util.List<p124h7.AbstractC2574cg> r3) {
            r2 = this;
            int r0 = r2.f11500b
            r0 = r0 & 7
            r1 = 2
            if (r0 != r1) goto L24
        L7:
            h7.cg r0 = r2.m6680z()
            r3.add(r0)
            h7.dg r0 = r2.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L17
            return
        L17:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6624e()
            int r1 = r2.f11500b
            if (r0 == r1) goto L7
            r2.f11502d = r0
            return
        L24:
            int r3 = p124h7.C2611f.f11503Y
            h7.e r3 = new h7.e
            r3.<init>()
            throw r3
    }

    /* renamed from: E */
    public final void m6654E(java.util.List<java.lang.Double> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p124h7.C2718kg
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L5e
            r0 = r5
            h7.kg r0 = (p124h7.C2718kg) r0
            int r5 = r4.f11500b
            r5 = r5 & 7
            if (r5 == r2) goto L3b
            if (r5 != r1) goto L33
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6623d()
            m6649t(r5)
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r5
        L1f:
            h7.dg r5 = r4.f11499a
            long r2 = r5.m6625f()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            r0.m6950e(r2)
            h7.dg r5 = r4.f11499a
            int r5 = r5.f11473f
            if (r5 < r1) goto L1f
            goto L8b
        L33:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L3b:
            h7.dg r5 = r4.f11499a
            long r1 = r5.m6625f()
            double r1 = java.lang.Double.longBitsToDouble(r1)
            r0.m6950e(r1)
            h7.dg r5 = r4.f11499a
            boolean r5 = r5.m6630k()
            if (r5 == 0) goto L51
            return
        L51:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6624e()
            int r1 = r4.f11500b
            if (r5 == r1) goto L3b
            r4.f11502d = r5
            return
        L5e:
            int r0 = r4.f11500b
            r0 = r0 & 7
            if (r0 == r2) goto L94
            if (r0 != r1) goto L8c
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6623d()
            m6649t(r0)
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L74:
            h7.dg r0 = r4.f11499a
            long r2 = r0.m6625f()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L74
        L8b:
            return
        L8c:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L94:
            h7.dg r0 = r4.f11499a
            long r0 = r0.m6625f()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto Lae
            return
        Lae:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6624e()
            int r1 = r4.f11500b
            if (r0 == r1) goto L94
            r4.f11502d = r0
            return
    }

    /* renamed from: F */
    public final void m6655F(java.util.List<java.lang.Integer> r3) {
            r2 = this;
            boolean r0 = r3 instanceof p124h7.C2988zg
            r1 = 2
            if (r0 == 0) goto L55
            r0 = r3
            h7.zg r0 = (p124h7.C2988zg) r0
            int r3 = r2.f11500b
            r3 = r3 & 7
            if (r3 == 0) goto L36
            if (r3 != r1) goto L2e
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            h7.dg r1 = r2.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r3
        L1b:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            r0.m7360h(r3)
            h7.dg r3 = r2.f11499a
            int r3 = r3.f11473f
            if (r3 < r1) goto L1b
            r2.m6673q(r1)
            return
        L2e:
            int r3 = p124h7.C2611f.f11503Y
            h7.e r3 = new h7.e
            r3.<init>()
            throw r3
        L36:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            r0.m7360h(r3)
            h7.dg r3 = r2.f11499a
            boolean r3 = r3.m6630k()
            if (r3 == 0) goto L48
            return
        L48:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6624e()
            int r1 = r2.f11500b
            if (r3 == r1) goto L36
            r2.f11502d = r3
            return
        L55:
            int r0 = r2.f11500b
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r1) goto L7f
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            h7.dg r1 = r2.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L68:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            h7.dg r0 = r2.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L68
            r2.m6673q(r1)
            return
        L7f:
            int r3 = p124h7.C2611f.f11503Y
            h7.e r3 = new h7.e
            r3.<init>()
            throw r3
        L87:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            h7.dg r0 = r2.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L9d
            return
        L9d:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6624e()
            int r1 = r2.f11500b
            if (r0 == r1) goto L87
            r2.f11502d = r0
            return
    }

    /* renamed from: G */
    public final void m6656G(java.util.List<java.lang.Integer> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p124h7.C2988zg
            r1 = 5
            r2 = 2
            if (r0 == 0) goto L57
            r0 = r5
            h7.zg r0 = (p124h7.C2988zg) r0
            int r5 = r4.f11500b
            r5 = r5 & 7
            if (r5 == r2) goto L38
            if (r5 != r1) goto L30
        L11:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6622c()
            r0.m7360h(r5)
            h7.dg r5 = r4.f11499a
            boolean r5 = r5.m6630k()
            if (r5 == 0) goto L23
            return
        L23:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6624e()
            int r1 = r4.f11500b
            if (r5 == r1) goto L11
            r4.f11502d = r5
            return
        L30:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L38:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6623d()
            m6648s(r5)
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r3 = r1 + r5
        L47:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6622c()
            r0.m7360h(r5)
            h7.dg r5 = r4.f11499a
            int r5 = r5.f11473f
            if (r5 < r3) goto L47
            goto Lab
        L57:
            int r0 = r4.f11500b
            r0 = r0 & 7
            if (r0 == r2) goto L8a
            if (r0 != r1) goto L82
        L5f:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6622c()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L75
            return
        L75:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6624e()
            int r1 = r4.f11500b
            if (r0 == r1) goto L5f
            r4.f11502d = r0
            return
        L82:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L8a:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6623d()
            m6648s(r0)
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L98:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6622c()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L98
        Lab:
            return
    }

    /* renamed from: a */
    public final void m6657a(java.util.List<java.lang.Long> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p124h7.C2755n
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L56
            r0 = r5
            h7.n r0 = (p124h7.C2755n) r0
            int r5 = r4.f11500b
            r5 = r5 & 7
            if (r5 == r2) goto L37
            if (r5 != r1) goto L2f
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6623d()
            m6649t(r5)
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r5
        L1f:
            h7.dg r5 = r4.f11499a
            long r2 = r5.m6625f()
            r0.m6990h(r2)
            h7.dg r5 = r4.f11499a
            int r5 = r5.f11473f
            if (r5 < r1) goto L1f
            goto L7f
        L2f:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L37:
            h7.dg r5 = r4.f11499a
            long r1 = r5.m6625f()
            r0.m6990h(r1)
            h7.dg r5 = r4.f11499a
            boolean r5 = r5.m6630k()
            if (r5 == 0) goto L49
            return
        L49:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6624e()
            int r1 = r4.f11500b
            if (r5 == r1) goto L37
            r4.f11502d = r5
            return
        L56:
            int r0 = r4.f11500b
            r0 = r0 & 7
            if (r0 == r2) goto L88
            if (r0 != r1) goto L80
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6623d()
            m6649t(r0)
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L6c:
            h7.dg r0 = r4.f11499a
            long r2 = r0.m6625f()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L6c
        L7f:
            return
        L80:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L88:
            h7.dg r0 = r4.f11499a
            long r0 = r0.m6625f()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L9e
            return
        L9e:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6624e()
            int r1 = r4.f11500b
            if (r0 == r1) goto L88
            r4.f11502d = r0
            return
    }

    /* renamed from: b */
    public final void m6658b(java.util.List<java.lang.Float> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p124h7.C2880tg
            r1 = 5
            r2 = 2
            if (r0 == 0) goto L5f
            r0 = r5
            h7.tg r0 = (p124h7.C2880tg) r0
            int r5 = r4.f11500b
            r5 = r5 & 7
            if (r5 == r2) goto L3c
            if (r5 != r1) goto L34
        L11:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6622c()
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r0.m7175e(r5)
            h7.dg r5 = r4.f11499a
            boolean r5 = r5.m6630k()
            if (r5 == 0) goto L27
            return
        L27:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6624e()
            int r1 = r4.f11500b
            if (r5 == r1) goto L11
            r4.f11502d = r5
            return
        L34:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L3c:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6623d()
            m6648s(r5)
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r3 = r1 + r5
        L4b:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6622c()
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r0.m7175e(r5)
            h7.dg r5 = r4.f11499a
            int r5 = r5.f11473f
            if (r5 < r3) goto L4b
            goto Lbb
        L5f:
            int r0 = r4.f11500b
            r0 = r0 & 7
            if (r0 == r2) goto L96
            if (r0 != r1) goto L8e
        L67:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6622c()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L81
            return
        L81:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6624e()
            int r1 = r4.f11500b
            if (r0 == r1) goto L67
            r4.f11502d = r0
            return
        L8e:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L96:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6623d()
            m6648s(r0)
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        La4:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6622c()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto La4
        Lbb:
            return
    }

    /* renamed from: c */
    public final <T> void m6659c(java.util.List<T> r4, p124h7.InterfaceC2666i0<T> r5, p124h7.C2754mg r6) {
            r3 = this;
            int r0 = r3.f11500b
            r1 = r0 & 7
            r2 = 3
            if (r1 != r2) goto L26
        L7:
            java.lang.Object r1 = r3.m6671o(r5, r6)
            r4.add(r1)
            h7.dg r1 = r3.f11499a
            boolean r1 = r1.m6630k()
            if (r1 != 0) goto L25
            int r1 = r3.f11502d
            if (r1 == 0) goto L1b
            goto L25
        L1b:
            h7.dg r1 = r3.f11499a
            int r1 = r1.m6624e()
            if (r1 == r0) goto L7
            r3.f11502d = r1
        L25:
            return
        L26:
            int r4 = p124h7.C2611f.f11503Y
            h7.e r4 = new h7.e
            r4.<init>()
            throw r4
    }

    /* renamed from: d */
    public final void m6660d(java.util.List<java.lang.Integer> r3) {
            r2 = this;
            boolean r0 = r3 instanceof p124h7.C2988zg
            r1 = 2
            if (r0 == 0) goto L55
            r0 = r3
            h7.zg r0 = (p124h7.C2988zg) r0
            int r3 = r2.f11500b
            r3 = r3 & 7
            if (r3 == 0) goto L36
            if (r3 != r1) goto L2e
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            h7.dg r1 = r2.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r3
        L1b:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            r0.m7360h(r3)
            h7.dg r3 = r2.f11499a
            int r3 = r3.f11473f
            if (r3 < r1) goto L1b
            r2.m6673q(r1)
            return
        L2e:
            int r3 = p124h7.C2611f.f11503Y
            h7.e r3 = new h7.e
            r3.<init>()
            throw r3
        L36:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            r0.m7360h(r3)
            h7.dg r3 = r2.f11499a
            boolean r3 = r3.m6630k()
            if (r3 == 0) goto L48
            return
        L48:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6624e()
            int r1 = r2.f11500b
            if (r3 == r1) goto L36
            r2.f11502d = r3
            return
        L55:
            int r0 = r2.f11500b
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r1) goto L7f
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            h7.dg r1 = r2.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L68:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            h7.dg r0 = r2.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L68
            r2.m6673q(r1)
            return
        L7f:
            int r3 = p124h7.C2611f.f11503Y
            h7.e r3 = new h7.e
            r3.<init>()
            throw r3
        L87:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            h7.dg r0 = r2.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L9d
            return
        L9d:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6624e()
            int r1 = r2.f11500b
            if (r0 == r1) goto L87
            r2.f11502d = r0
            return
    }

    /* renamed from: e */
    public final void m6661e(java.util.List<java.lang.Long> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p124h7.C2755n
            r1 = 2
            if (r0 == 0) goto L55
            r0 = r5
            h7.n r0 = (p124h7.C2755n) r0
            int r5 = r4.f11500b
            r5 = r5 & 7
            if (r5 == 0) goto L36
            if (r5 != r1) goto L2e
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6623d()
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r5
        L1b:
            h7.dg r5 = r4.f11499a
            long r2 = r5.m6626g()
            r0.m6990h(r2)
            h7.dg r5 = r4.f11499a
            int r5 = r5.f11473f
            if (r5 < r1) goto L1b
            r4.m6673q(r1)
            return
        L2e:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L36:
            h7.dg r5 = r4.f11499a
            long r1 = r5.m6626g()
            r0.m6990h(r1)
            h7.dg r5 = r4.f11499a
            boolean r5 = r5.m6630k()
            if (r5 == 0) goto L48
            return
        L48:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6624e()
            int r1 = r4.f11500b
            if (r5 == r1) goto L36
            r4.f11502d = r5
            return
        L55:
            int r0 = r4.f11500b
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r1) goto L7f
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6623d()
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L68:
            h7.dg r0 = r4.f11499a
            long r2 = r0.m6626g()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L68
            r4.m6673q(r1)
            return
        L7f:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L87:
            h7.dg r0 = r4.f11499a
            long r0 = r0.m6626g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L9d
            return
        L9d:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6624e()
            int r1 = r4.f11500b
            if (r0 == r1) goto L87
            r4.f11502d = r0
            return
    }

    /* renamed from: f */
    public final <T> void m6662f(java.util.List<T> r4, p124h7.InterfaceC2666i0<T> r5, p124h7.C2754mg r6) {
            r3 = this;
            int r0 = r3.f11500b
            r1 = r0 & 7
            r2 = 2
            if (r1 != r2) goto L26
        L7:
            java.lang.Object r1 = r3.m6672p(r5, r6)
            r4.add(r1)
            h7.dg r1 = r3.f11499a
            boolean r1 = r1.m6630k()
            if (r1 != 0) goto L25
            int r1 = r3.f11502d
            if (r1 == 0) goto L1b
            goto L25
        L1b:
            h7.dg r1 = r3.f11499a
            int r1 = r1.m6624e()
            if (r1 == r0) goto L7
            r3.f11502d = r1
        L25:
            return
        L26:
            int r4 = p124h7.C2611f.f11503Y
            h7.e r4 = new h7.e
            r4.<init>()
            throw r4
    }

    /* renamed from: g */
    public final void m6663g(java.util.List<java.lang.Integer> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p124h7.C2988zg
            r1 = 5
            r2 = 2
            if (r0 == 0) goto L57
            r0 = r5
            h7.zg r0 = (p124h7.C2988zg) r0
            int r5 = r4.f11500b
            r5 = r5 & 7
            if (r5 == r2) goto L38
            if (r5 != r1) goto L30
        L11:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6622c()
            r0.m7360h(r5)
            h7.dg r5 = r4.f11499a
            boolean r5 = r5.m6630k()
            if (r5 == 0) goto L23
            return
        L23:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6624e()
            int r1 = r4.f11500b
            if (r5 == r1) goto L11
            r4.f11502d = r5
            return
        L30:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L38:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6623d()
            m6648s(r5)
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r3 = r1 + r5
        L47:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6622c()
            r0.m7360h(r5)
            h7.dg r5 = r4.f11499a
            int r5 = r5.f11473f
            if (r5 < r3) goto L47
            goto Lab
        L57:
            int r0 = r4.f11500b
            r0 = r0 & 7
            if (r0 == r2) goto L8a
            if (r0 != r1) goto L82
        L5f:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6622c()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L75
            return
        L75:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6624e()
            int r1 = r4.f11500b
            if (r0 == r1) goto L5f
            r4.f11502d = r0
            return
        L82:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L8a:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6623d()
            m6648s(r0)
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L98:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6622c()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L98
        Lab:
            return
    }

    /* renamed from: h */
    public final void m6664h(java.util.List<java.lang.Long> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p124h7.C2755n
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L56
            r0 = r5
            h7.n r0 = (p124h7.C2755n) r0
            int r5 = r4.f11500b
            r5 = r5 & 7
            if (r5 == r2) goto L37
            if (r5 != r1) goto L2f
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6623d()
            m6649t(r5)
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r5
        L1f:
            h7.dg r5 = r4.f11499a
            long r2 = r5.m6625f()
            r0.m6990h(r2)
            h7.dg r5 = r4.f11499a
            int r5 = r5.f11473f
            if (r5 < r1) goto L1f
            goto L7f
        L2f:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L37:
            h7.dg r5 = r4.f11499a
            long r1 = r5.m6625f()
            r0.m6990h(r1)
            h7.dg r5 = r4.f11499a
            boolean r5 = r5.m6630k()
            if (r5 == 0) goto L49
            return
        L49:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6624e()
            int r1 = r4.f11500b
            if (r5 == r1) goto L37
            r4.f11502d = r5
            return
        L56:
            int r0 = r4.f11500b
            r0 = r0 & 7
            if (r0 == r2) goto L88
            if (r0 != r1) goto L80
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6623d()
            m6649t(r0)
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L6c:
            h7.dg r0 = r4.f11499a
            long r2 = r0.m6625f()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L6c
        L7f:
            return
        L80:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L88:
            h7.dg r0 = r4.f11499a
            long r0 = r0.m6625f()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L9e
            return
        L9e:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6624e()
            int r1 = r4.f11500b
            if (r0 == r1) goto L88
            r4.f11502d = r0
            return
    }

    /* renamed from: i */
    public final void m6665i(java.util.List<java.lang.Integer> r3) {
            r2 = this;
            boolean r0 = r3 instanceof p124h7.C2988zg
            r1 = 2
            if (r0 == 0) goto L5d
            r0 = r3
            h7.zg r0 = (p124h7.C2988zg) r0
            int r3 = r2.f11500b
            r3 = r3 & 7
            if (r3 == 0) goto L3a
            if (r3 != r1) goto L32
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            h7.dg r1 = r2.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r3
        L1b:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            int r3 = p124h7.C2592dg.m6618n(r3)
            r0.m7360h(r3)
            h7.dg r3 = r2.f11499a
            int r3 = r3.f11473f
            if (r3 < r1) goto L1b
            r2.m6673q(r1)
            return
        L32:
            int r3 = p124h7.C2611f.f11503Y
            h7.e r3 = new h7.e
            r3.<init>()
            throw r3
        L3a:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            int r3 = p124h7.C2592dg.m6618n(r3)
            r0.m7360h(r3)
            h7.dg r3 = r2.f11499a
            boolean r3 = r3.m6630k()
            if (r3 == 0) goto L50
            return
        L50:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6624e()
            int r1 = r2.f11500b
            if (r3 == r1) goto L3a
            r2.f11502d = r3
            return
        L5d:
            int r0 = r2.f11500b
            r0 = r0 & 7
            if (r0 == 0) goto L93
            if (r0 != r1) goto L8b
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            h7.dg r1 = r2.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L70:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            int r0 = p124h7.C2592dg.m6618n(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            h7.dg r0 = r2.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L70
            r2.m6673q(r1)
            return
        L8b:
            int r3 = p124h7.C2611f.f11503Y
            h7.e r3 = new h7.e
            r3.<init>()
            throw r3
        L93:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            int r0 = p124h7.C2592dg.m6618n(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            h7.dg r0 = r2.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto Lad
            return
        Lad:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6624e()
            int r1 = r2.f11500b
            if (r0 == r1) goto L93
            r2.f11502d = r0
            return
    }

    /* renamed from: j */
    public final void m6666j(java.util.List<java.lang.Long> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p124h7.C2755n
            r1 = 2
            if (r0 == 0) goto L5d
            r0 = r5
            h7.n r0 = (p124h7.C2755n) r0
            int r5 = r4.f11500b
            r5 = r5 & 7
            if (r5 == 0) goto L3a
            if (r5 != r1) goto L32
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6623d()
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r5
        L1b:
            h7.dg r5 = r4.f11499a
            long r2 = r5.m6626g()
            long r2 = p124h7.C2592dg.m6619o(r2)
            r0.m6990h(r2)
            h7.dg r5 = r4.f11499a
            int r5 = r5.f11473f
            if (r5 < r1) goto L1b
            r4.m6673q(r1)
            return
        L32:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L3a:
            h7.dg r5 = r4.f11499a
            long r1 = r5.m6626g()
            long r1 = p124h7.C2592dg.m6619o(r1)
            r0.m6990h(r1)
            h7.dg r5 = r4.f11499a
            boolean r5 = r5.m6630k()
            if (r5 == 0) goto L50
            return
        L50:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6624e()
            int r1 = r4.f11500b
            if (r5 == r1) goto L3a
            r4.f11502d = r5
            return
        L5d:
            int r0 = r4.f11500b
            r0 = r0 & 7
            if (r0 == 0) goto L93
            if (r0 != r1) goto L8b
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6623d()
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L70:
            h7.dg r0 = r4.f11499a
            long r2 = r0.m6626g()
            long r2 = p124h7.C2592dg.m6619o(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L70
            r4.m6673q(r1)
            return
        L8b:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L93:
            h7.dg r0 = r4.f11499a
            long r0 = r0.m6626g()
            long r0 = p124h7.C2592dg.m6619o(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto Lad
            return
        Lad:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6624e()
            int r1 = r4.f11500b
            if (r0 == r1) goto L93
            r4.f11502d = r0
            return
    }

    /* renamed from: k */
    public final void m6667k(java.util.List<java.lang.String> r3, boolean r4) {
            r2 = this;
            int r0 = r2.f11500b
            r0 = r0 & 7
            r1 = 2
            if (r0 != r1) goto L52
            boolean r0 = r3 instanceof p124h7.InterfaceC2683j
            if (r0 != 0) goto Lc
            goto L2e
        Lc:
            if (r4 != 0) goto L2e
            r0 = r3
            h7.j r0 = (p124h7.InterfaceC2683j) r0
        L11:
            h7.cg r3 = r2.m6680z()
            r0.mo6820V(r3)
            h7.dg r3 = r2.f11499a
            boolean r3 = r3.m6630k()
            if (r3 == 0) goto L21
            return
        L21:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6624e()
            int r4 = r2.f11500b
            if (r3 == r4) goto L11
            r2.f11502d = r3
            return
        L2e:
            if (r4 == 0) goto L35
            java.lang.String r0 = r2.m6651B()
            goto L39
        L35:
            java.lang.String r0 = r2.m6650A()
        L39:
            r3.add(r0)
            h7.dg r0 = r2.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L45
            return
        L45:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6624e()
            int r1 = r2.f11500b
            if (r0 == r1) goto L2e
            r2.f11502d = r0
            return
        L52:
            int r3 = p124h7.C2611f.f11503Y
            h7.e r3 = new h7.e
            r3.<init>()
            throw r3
    }

    /* renamed from: l */
    public final void m6668l(java.util.List<java.lang.Integer> r3) {
            r2 = this;
            boolean r0 = r3 instanceof p124h7.C2988zg
            r1 = 2
            if (r0 == 0) goto L55
            r0 = r3
            h7.zg r0 = (p124h7.C2988zg) r0
            int r3 = r2.f11500b
            r3 = r3 & 7
            if (r3 == 0) goto L36
            if (r3 != r1) goto L2e
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            h7.dg r1 = r2.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r3
        L1b:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            r0.m7360h(r3)
            h7.dg r3 = r2.f11499a
            int r3 = r3.f11473f
            if (r3 < r1) goto L1b
            r2.m6673q(r1)
            return
        L2e:
            int r3 = p124h7.C2611f.f11503Y
            h7.e r3 = new h7.e
            r3.<init>()
            throw r3
        L36:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6623d()
            r0.m7360h(r3)
            h7.dg r3 = r2.f11499a
            boolean r3 = r3.m6630k()
            if (r3 == 0) goto L48
            return
        L48:
            h7.dg r3 = r2.f11499a
            int r3 = r3.m6624e()
            int r1 = r2.f11500b
            if (r3 == r1) goto L36
            r2.f11502d = r3
            return
        L55:
            int r0 = r2.f11500b
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r1) goto L7f
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            h7.dg r1 = r2.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L68:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            h7.dg r0 = r2.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L68
            r2.m6673q(r1)
            return
        L7f:
            int r3 = p124h7.C2611f.f11503Y
            h7.e r3 = new h7.e
            r3.<init>()
            throw r3
        L87:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6623d()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            h7.dg r0 = r2.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L9d
            return
        L9d:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6624e()
            int r1 = r2.f11500b
            if (r0 == r1) goto L87
            r2.f11502d = r0
            return
    }

    /* renamed from: m */
    public final void m6669m(java.util.List<java.lang.Long> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p124h7.C2755n
            r1 = 2
            if (r0 == 0) goto L55
            r0 = r5
            h7.n r0 = (p124h7.C2755n) r0
            int r5 = r4.f11500b
            r5 = r5 & 7
            if (r5 == 0) goto L36
            if (r5 != r1) goto L2e
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6623d()
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r5
        L1b:
            h7.dg r5 = r4.f11499a
            long r2 = r5.m6626g()
            r0.m6990h(r2)
            h7.dg r5 = r4.f11499a
            int r5 = r5.f11473f
            if (r5 < r1) goto L1b
            r4.m6673q(r1)
            return
        L2e:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L36:
            h7.dg r5 = r4.f11499a
            long r1 = r5.m6626g()
            r0.m6990h(r1)
            h7.dg r5 = r4.f11499a
            boolean r5 = r5.m6630k()
            if (r5 == 0) goto L48
            return
        L48:
            h7.dg r5 = r4.f11499a
            int r5 = r5.m6624e()
            int r1 = r4.f11500b
            if (r5 == r1) goto L36
            r4.f11502d = r5
            return
        L55:
            int r0 = r4.f11500b
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r1) goto L7f
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6623d()
            h7.dg r1 = r4.f11499a
            int r1 = r1.f11473f
            int r1 = r1 + r0
        L68:
            h7.dg r0 = r4.f11499a
            long r2 = r0.m6626g()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            int r0 = r0.f11473f
            if (r0 < r1) goto L68
            r4.m6673q(r1)
            return
        L7f:
            int r5 = p124h7.C2611f.f11503Y
            h7.e r5 = new h7.e
            r5.<init>()
            throw r5
        L87:
            h7.dg r0 = r4.f11499a
            long r0 = r0.m6626g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            h7.dg r0 = r4.f11499a
            boolean r0 = r0.m6630k()
            if (r0 == 0) goto L9d
            return
        L9d:
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6624e()
            int r1 = r4.f11500b
            if (r0 == r1) goto L87
            r4.f11502d = r0
            return
    }

    /* renamed from: n */
    public final boolean m6670n() {
            r2 = this;
            h7.dg r0 = r2.f11499a
            boolean r0 = r0.m6630k()
            if (r0 != 0) goto L16
            int r0 = r2.f11500b
            int r1 = r2.f11501c
            if (r0 != r1) goto Lf
            goto L16
        Lf:
            h7.dg r1 = r2.f11499a
            boolean r0 = r1.m6632m(r0)
            return r0
        L16:
            r0 = 0
            return r0
    }

    /* renamed from: o */
    public final <T> T m6671o(p124h7.InterfaceC2666i0<T> r3, p124h7.C2754mg r4) {
            r2 = this;
            int r0 = r2.f11501c
            int r1 = r2.f11500b
            int r1 = r1 >>> 3
            int r1 = r1 << 3
            r1 = r1 | 4
            r2.f11501c = r1
            java.lang.Object r1 = r3.mo6441d()     // Catch: java.lang.Throwable -> L24
            r3.mo6444g(r1, r2, r4)     // Catch: java.lang.Throwable -> L24
            r3.mo6440c(r1)     // Catch: java.lang.Throwable -> L24
            int r3 = r2.f11500b     // Catch: java.lang.Throwable -> L24
            int r4 = r2.f11501c     // Catch: java.lang.Throwable -> L24
            if (r3 != r4) goto L1f
            r2.f11501c = r0
            return r1
        L1f:
            h7.f r3 = p124h7.C2611f.m6686f()     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L24
        L24:
            r3 = move-exception
            r2.f11501c = r0
            throw r3
    }

    /* renamed from: p */
    public final <T> T m6672p(p124h7.InterfaceC2666i0<T> r5, p124h7.C2754mg r6) {
            r4 = this;
            h7.dg r0 = r4.f11499a
            int r0 = r0.m6623d()
            h7.dg r1 = r4.f11499a
            int r2 = r1.f11468a
            r3 = 100
            if (r2 >= r3) goto L38
            int r0 = r1.m6621b(r0)
            java.lang.Object r1 = r5.mo6441d()
            h7.dg r2 = r4.f11499a
            int r3 = r2.f11468a
            int r3 = r3 + 1
            r2.f11468a = r3
            r5.mo6444g(r1, r4, r6)
            r5.mo6440c(r1)
            h7.dg r5 = r4.f11499a
            r6 = 0
            r5.m6628i(r6)
            h7.dg r5 = r4.f11499a
            int r6 = r5.f11468a
            int r6 = r6 + (-1)
            r5.f11468a = r6
            r5.f11475h = r0
            r5.m6633p()
            return r1
        L38:
            h7.f r5 = new h7.f
            java.lang.String r6 = "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: q */
    public final void m6673q(int r2) {
            r1 = this;
            h7.dg r0 = r1.f11499a
            int r0 = r0.f11473f
            if (r0 != r2) goto L7
            return
        L7:
            h7.f r2 = p124h7.C2611f.m6687g()
            throw r2
    }

    /* renamed from: r */
    public final void m6674r(int r2) {
            r1 = this;
            int r0 = r1.f11500b
            r0 = r0 & 7
            if (r0 != r2) goto L7
            return
        L7:
            int r2 = p124h7.C2611f.f11503Y
            h7.e r2 = new h7.e
            r2.<init>()
            throw r2
    }

    /* renamed from: u */
    public final int m6675u() {
            r2 = this;
            int r0 = r2.f11502d
            if (r0 == 0) goto La
            r2.f11500b = r0
            r1 = 0
            r2.f11502d = r1
            goto L12
        La:
            h7.dg r0 = r2.f11499a
            int r0 = r0.m6624e()
            r2.f11500b = r0
        L12:
            if (r0 == 0) goto L1c
            int r1 = r2.f11501c
            if (r0 != r1) goto L19
            goto L1c
        L19:
            int r0 = r0 >>> 3
            return r0
        L1c:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    /* renamed from: v */
    public final int m6676v() {
            r1 = this;
            r0 = 5
            r1.m6674r(r0)
            h7.dg r0 = r1.f11499a
            int r0 = r0.m6622c()
            return r0
    }

    /* renamed from: w */
    public final int m6677w() {
            r1 = this;
            r0 = 0
            r1.m6674r(r0)
            h7.dg r0 = r1.f11499a
            int r0 = r0.m6623d()
            return r0
    }

    /* renamed from: x */
    public final long m6678x() {
            r2 = this;
            r0 = 1
            r2.m6674r(r0)
            h7.dg r0 = r2.f11499a
            long r0 = r0.m6625f()
            return r0
    }

    /* renamed from: y */
    public final long m6679y() {
            r2 = this;
            r0 = 0
            r2.m6674r(r0)
            h7.dg r0 = r2.f11499a
            long r0 = r0.m6626g()
            return r0
    }

    /* renamed from: z */
    public final p124h7.AbstractC2574cg m6680z() {
            r4 = this;
            r0 = 2
            r4.m6674r(r0)
            h7.dg r0 = r4.f11499a
            int r1 = r0.m6623d()
            if (r1 <= 0) goto L20
            int r2 = r0.f11471d
            int r3 = r0.f11473f
            int r2 = r2 - r3
            if (r1 <= r2) goto L14
            goto L20
        L14:
            byte[] r2 = r0.f11470c
            h7.cg r2 = p124h7.AbstractC2574cg.m6534A(r2, r3, r1)
            int r3 = r0.f11473f
            int r3 = r3 + r1
            r0.f11473f = r3
            goto L4b
        L20:
            if (r1 == 0) goto L49
            if (r1 <= 0) goto L3d
            int r2 = r0.f11471d
            int r3 = r0.f11473f
            int r2 = r2 - r3
            if (r1 <= r2) goto L2c
            goto L3d
        L2c:
            int r1 = r1 + r3
            r0.f11473f = r1
            byte[] r0 = r0.f11470c
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r3, r1)
            h7.cg r1 = p124h7.AbstractC2574cg.f11427Z
            h7.bg r2 = new h7.bg
            r2.<init>(r0)
            goto L4b
        L3d:
            if (r1 > 0) goto L44
            h7.f r0 = p124h7.C2611f.m6685e()
            throw r0
        L44:
            h7.f r0 = p124h7.C2611f.m6687g()
            throw r0
        L49:
            h7.cg r2 = p124h7.AbstractC2574cg.f11427Z
        L4b:
            return r2
    }
}
