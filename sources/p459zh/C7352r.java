package p459zh;

/* renamed from: zh.r */
/* loaded from: classes.dex */
public final class C7352r {

    /* renamed from: a */
    public static final p459zh.C7350p f28111a = null;

    /* renamed from: zh.r$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Object, p101fh.InterfaceC2175g.a, java.lang.Object> {

        /* renamed from: Z */
        public static final p459zh.C7352r.a f28112Z = null;

        static {
                zh.r$a r0 = new zh.r$a
                r0.<init>()
                p459zh.C7352r.a.f28112Z = r0
                return
        }

        public a() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(java.lang.Object r2, p101fh.InterfaceC2175g.a r3) {
                r1 = this;
                fh.g$a r3 = (p101fh.InterfaceC2175g.a) r3
                boolean r0 = r3 instanceof p379vh.InterfaceC6735r1
                if (r0 == 0) goto L20
                boolean r0 = r2 instanceof java.lang.Integer
                if (r0 == 0) goto Ld
                java.lang.Integer r2 = (java.lang.Integer) r2
                goto Le
            Ld:
                r2 = 0
            Le:
                r0 = 1
                if (r2 != 0) goto L13
                r2 = 1
                goto L17
            L13:
                int r2 = r2.intValue()
            L17:
                if (r2 != 0) goto L1b
                r2 = r3
                goto L20
            L1b:
                int r2 = r2 + r0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            L20:
                return r2
        }
    }

    /* renamed from: zh.r$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<p379vh.InterfaceC6735r1<?>, p101fh.InterfaceC2175g.a, p379vh.InterfaceC6735r1<?>> {

        /* renamed from: Z */
        public static final p459zh.C7352r.b f28113Z = null;

        static {
                zh.r$b r0 = new zh.r$b
                r0.<init>()
                p459zh.C7352r.b.f28113Z = r0
                return
        }

        public b() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public p379vh.InterfaceC6735r1<?> mo122l(p379vh.InterfaceC6735r1<?> r1, p101fh.InterfaceC2175g.a r2) {
                r0 = this;
                vh.r1 r1 = (p379vh.InterfaceC6735r1) r1
                fh.g$a r2 = (p101fh.InterfaceC2175g.a) r2
                if (r1 == 0) goto L7
                goto L10
            L7:
                boolean r1 = r2 instanceof p379vh.InterfaceC6735r1
                if (r1 == 0) goto Lf
                vh.r1 r2 = (p379vh.InterfaceC6735r1) r2
                r1 = r2
                goto L10
            Lf:
                r1 = 0
            L10:
                return r1
        }
    }

    /* renamed from: zh.r$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<p459zh.C7355u, p101fh.InterfaceC2175g.a, p459zh.C7355u> {

        /* renamed from: Z */
        public static final p459zh.C7352r.c f28114Z = null;

        static {
                zh.r$c r0 = new zh.r$c
                r0.<init>()
                p459zh.C7352r.c.f28114Z = r0
                return
        }

        public c() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public p459zh.C7355u mo122l(p459zh.C7355u r4, p101fh.InterfaceC2175g.a r5) {
                r3 = this;
                zh.u r4 = (p459zh.C7355u) r4
                fh.g$a r5 = (p101fh.InterfaceC2175g.a) r5
                boolean r0 = r5 instanceof p379vh.InterfaceC6735r1
                if (r0 == 0) goto L1e
                vh.r1 r5 = (p379vh.InterfaceC6735r1) r5
                fh.g r0 = r4.f28116a
                java.lang.Object r0 = r5.m13662L(r0)
                java.lang.Object[] r1 = r4.f28117b
                int r2 = r4.f28119d
                r1[r2] = r0
                kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] r0 = r4.f28118c
                int r1 = r2 + 1
                r4.f28119d = r1
                r0[r2] = r5
            L1e:
                return r4
        }
    }

    static {
            zh.p r0 = new zh.p
            java.lang.String r1 = "NO_THREAD_ELEMENTS"
            r0.<init>(r1)
            p459zh.C7352r.f28111a = r0
            return
    }

    /* renamed from: a */
    public static final void m14436a(p101fh.InterfaceC2175g r4, java.lang.Object r5) {
            zh.p r0 = p459zh.C7352r.f28111a
            if (r5 != r0) goto L5
            return
        L5:
            boolean r0 = r5 instanceof p459zh.C7355u
            if (r0 == 0) goto L27
            zh.u r5 = (p459zh.C7355u) r5
            kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] r0 = r5.f28118c
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r0 < 0) goto L38
        L12:
            int r1 = r0 + (-1)
            kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] r2 = r5.f28118c
            r2 = r2[r0]
            p214m2.C4339q.m9704i(r2)
            java.lang.Object[] r3 = r5.f28117b
            r0 = r3[r0]
            r2.m13663i(r4, r0)
            if (r1 >= 0) goto L25
            goto L38
        L25:
            r0 = r1
            goto L12
        L27:
            r0 = 0
            zh.r$b r1 = p459zh.C7352r.b.f28113Z
            java.lang.Object r0 = r4.fold(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"
            java.util.Objects.requireNonNull(r0, r1)
            vh.r1 r0 = (p379vh.InterfaceC6735r1) r0
            r0.m13663i(r4, r5)
        L38:
            return
    }

    /* renamed from: b */
    public static final java.lang.Object m14437b(p101fh.InterfaceC2175g r1, java.lang.Object r2) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r2 != 0) goto L10
            zh.r$a r2 = p459zh.C7352r.a.f28112Z
            java.lang.Object r2 = r1.fold(r0, r2)
            p214m2.C4339q.m9704i(r2)
        L10:
            if (r2 != r0) goto L15
            zh.p r1 = p459zh.C7352r.f28111a
            goto L31
        L15:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L2b
            zh.u r0 = new zh.u
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.<init>(r1, r2)
            zh.r$c r2 = p459zh.C7352r.c.f28114Z
            java.lang.Object r1 = r1.fold(r0, r2)
            goto L31
        L2b:
            vh.r1 r2 = (p379vh.InterfaceC6735r1) r2
            java.lang.Object r1 = r2.m13662L(r1)
        L31:
            return r1
    }
}
