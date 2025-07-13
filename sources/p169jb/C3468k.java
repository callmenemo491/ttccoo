package p169jb;

/* renamed from: jb.k */
/* loaded from: classes.dex */
public final class C3468k {

    /* renamed from: a */
    public lb.C4252o f14954a;

    /* renamed from: b */
    public p169jb.EnumC3481x f14955b;

    /* renamed from: c */
    public p169jb.InterfaceC3461d f14956c;

    /* renamed from: d */
    public final java.util.Map<java.lang.reflect.Type, p169jb.InterfaceC3469l<?>> f14957d;

    /* renamed from: e */
    public final java.util.List<p169jb.InterfaceC3458a0> f14958e;

    /* renamed from: f */
    public final java.util.List<p169jb.InterfaceC3458a0> f14959f;

    /* renamed from: g */
    public boolean f14960g;

    /* renamed from: h */
    public java.lang.String f14961h;

    /* renamed from: i */
    public int f14962i;

    /* renamed from: j */
    public int f14963j;

    /* renamed from: k */
    public boolean f14964k;

    /* renamed from: l */
    public boolean f14965l;

    public C3468k() {
            r2 = this;
            r2.<init>()
            lb.o r0 = lb.C4252o.f17425a0
            r2.f14954a = r0
            jb.x r0 = p169jb.EnumC3481x.f14970Y
            r2.f14955b = r0
            jb.c r0 = p169jb.EnumC3460c.f14935Y
            r2.f14956c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f14957d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f14958e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f14959f = r0
            r0 = 0
            r2.f14960g = r0
            r1 = 2
            r2.f14962i = r1
            r2.f14963j = r1
            r1 = 1
            r2.f14964k = r1
            r2.f14965l = r0
            return
    }

    /* renamed from: a */
    public p169jb.C3467j m7939a() {
            r20 = this;
            r0 = r20
            java.util.ArrayList r15 = new java.util.ArrayList
            java.util.List<jb.a0> r1 = r0.f14958e
            int r1 = r1.size()
            java.util.List<jb.a0> r2 = r0.f14959f
            int r2 = r2.size()
            int r2 = r2 + r1
            int r2 = r2 + 3
            r15.<init>(r2)
            java.util.List<jb.a0> r1 = r0.f14958e
            r15.addAll(r1)
            java.util.Collections.reverse(r15)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<jb.a0> r2 = r0.f14959f
            r1.<init>(r2)
            java.util.Collections.reverse(r1)
            r15.addAll(r1)
            java.lang.String r1 = r0.f14961h
            int r2 = r0.f14962i
            int r3 = r0.f14963j
            if (r1 == 0) goto L55
            java.lang.String r4 = r1.trim()
            java.lang.String r5 = ""
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L55
            jb.a r2 = new jb.a
            java.lang.Class<java.util.Date> r3 = java.util.Date.class
            r2.<init>(r3, r1)
            jb.a r3 = new jb.a
            java.lang.Class<java.sql.Timestamp> r4 = java.sql.Timestamp.class
            r3.<init>(r4, r1)
            jb.a r4 = new jb.a
            java.lang.Class<java.sql.Date> r5 = java.sql.Date.class
            r4.<init>(r5, r1)
            goto L72
        L55:
            r1 = 2
            if (r2 == r1) goto L92
            if (r3 == r1) goto L92
            jb.a r1 = new jb.a
            java.lang.Class<java.util.Date> r4 = java.util.Date.class
            r1.<init>(r4, r2, r3)
            jb.a r4 = new jb.a
            java.lang.Class<java.sql.Timestamp> r5 = java.sql.Timestamp.class
            r4.<init>(r5, r2, r3)
            jb.a r5 = new jb.a
            java.lang.Class<java.sql.Date> r6 = java.sql.Date.class
            r5.<init>(r6, r2, r3)
            r2 = r1
            r3 = r4
            r4 = r5
        L72:
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            jb.a0 r5 = p222mb.C4524o.f18376a
            mb.p r5 = new mb.p
            r5.<init>(r1, r2)
            r15.add(r5)
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            mb.p r2 = new mb.p
            r2.<init>(r1, r3)
            r15.add(r2)
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            mb.p r2 = new mb.p
            r2.<init>(r1, r4)
            r15.add(r2)
        L92:
            jb.j r19 = new jb.j
            r1 = r19
            lb.o r2 = r0.f14954a
            jb.d r3 = r0.f14956c
            java.util.Map<java.lang.reflect.Type, jb.l<?>> r4 = r0.f14957d
            boolean r5 = r0.f14960g
            r6 = 0
            r7 = 0
            boolean r8 = r0.f14964k
            boolean r9 = r0.f14965l
            r10 = 0
            r11 = 0
            jb.x r12 = r0.f14955b
            java.lang.String r13 = r0.f14961h
            int r14 = r0.f14962i
            int r6 = r0.f14963j
            r18 = r15
            r15 = r6
            java.util.List<jb.a0> r6 = r0.f14958e
            r16 = r6
            java.util.List<jb.a0> r6 = r0.f14959f
            r17 = r6
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r19
    }
}
