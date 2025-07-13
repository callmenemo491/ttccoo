package p221m9;

import p221m9.C4490t.a;

/* renamed from: m9.t */
/* loaded from: classes.dex */
public final class C4490t<T extends p221m9.C4490t.a<T>> {

    /* renamed from: d */
    public static final p221m9.C4490t f18224d = null;

    /* renamed from: a */
    public final p221m9.C4459i1<T, java.lang.Object> f18225a;

    /* renamed from: b */
    public boolean f18226b;

    /* renamed from: c */
    public boolean f18227c;

    /* renamed from: m9.t$a */
    public interface a<T extends p221m9.C4490t.a<T>> extends java.lang.Comparable<T> {
        /* renamed from: d */
        int mo10313d();

        /* renamed from: f */
        boolean mo10314f();

        /* renamed from: i */
        p221m9.EnumC4492t1 mo10315i();

        /* renamed from: j */
        p221m9.InterfaceC4482q0.a mo10316j(p221m9.InterfaceC4482q0.a r1, p221m9.InterfaceC4482q0 r2);

        /* renamed from: m */
        p221m9.EnumC4495u1 mo10317m();

        /* renamed from: n */
        boolean mo10318n();
    }

    static {
            m9.t r0 = new m9.t
            r1 = 1
            r0.<init>(r1)
            p221m9.C4490t.f18224d = r0
            return
    }

    public C4490t() {
            r2 = this;
            r2.<init>()
            int r0 = p221m9.C4459i1.f18161e0
            m9.h1 r0 = new m9.h1
            r1 = 16
            r0.<init>(r1)
            r2.f18225a = r0
            return
    }

    public C4490t(boolean r2) {
            r1 = this;
            int r2 = p221m9.C4459i1.f18161e0
            m9.h1 r2 = new m9.h1
            r0 = 0
            r2.<init>(r0)
            r1.<init>()
            r1.f18225a = r2
            r1.m10309l()
            r1.m10309l()
            return
    }

    /* renamed from: b */
    public static java.lang.Object m10298b(java.lang.Object r3) {
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto Lf
            byte[] r3 = (byte[]) r3
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            return r0
        Lf:
            return r3
    }

    /* renamed from: c */
    public static int m10299c(p221m9.EnumC4492t1 r1, int r2, java.lang.Object r3) {
            int r2 = p221m9.AbstractC4463k.m10131F(r2)
            m9.t1 r0 = p221m9.EnumC4492t1.f18256j0
            if (r1 != r0) goto La
            int r2 = r2 * 2
        La:
            int r1 = m10300d(r1, r3)
            int r1 = r1 + r2
            return r1
    }

    /* renamed from: d */
    public static int m10300d(p221m9.EnumC4492t1 r0, java.lang.Object r1) {
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto Ld1;
                case 1: goto Lc8;
                case 2: goto Lbd;
                case 3: goto Lb2;
                case 4: goto La7;
                case 5: goto La1;
                case 6: goto L9b;
                case 7: goto L92;
                case 8: goto L80;
                case 9: goto L77;
                case 10: goto L5f;
                case 11: goto L4a;
                case 12: goto L3f;
                case 13: goto L25;
                case 14: goto L9b;
                case 15: goto La1;
                case 16: goto L1a;
                case 17: goto Lf;
                default: goto L7;
            }
        L7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "There is no way to get here, but the compiler thinks otherwise."
            r0.<init>(r1)
            throw r0
        Lf:
            java.lang.Long r1 = (java.lang.Long) r1
            long r0 = r1.longValue()
            int r0 = p221m9.AbstractC4463k.m10128C(r0)
            return r0
        L1a:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            int r0 = p221m9.AbstractC4463k.m10126A(r0)
            return r0
        L25:
            boolean r0 = r1 instanceof p221m9.C4505z.a
            if (r0 == 0) goto L34
            m9.z$a r1 = (p221m9.C4505z.a) r1
            int r0 = r1.mo9432d()
            int r0 = p221m9.AbstractC4463k.m10148t(r0)
            return r0
        L34:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            int r0 = p221m9.AbstractC4463k.m10148t(r0)
            return r0
        L3f:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            int r0 = p221m9.AbstractC4463k.m10133H(r0)
            return r0
        L4a:
            boolean r0 = r1 instanceof p221m9.AbstractC4454h
            if (r0 == 0) goto L55
            m9.h r1 = (p221m9.AbstractC4454h) r1
            int r0 = p221m9.AbstractC4463k.m10140l(r1)
            return r0
        L55:
            byte[] r1 = (byte[]) r1
            java.util.logging.Logger r0 = p221m9.AbstractC4463k.f18182b
            int r0 = r1.length
            int r0 = p221m9.AbstractC4463k.m10151w(r0)
            return r0
        L5f:
            boolean r0 = r1 instanceof p221m9.C4440c0
            if (r0 == 0) goto L6a
            m9.c0 r1 = (p221m9.C4440c0) r1
            int r0 = p221m9.AbstractC4463k.m10150v(r1)
            return r0
        L6a:
            m9.q0 r1 = (p221m9.InterfaceC4482q0) r1
            java.util.logging.Logger r0 = p221m9.AbstractC4463k.f18182b
            int r0 = r1.mo10233a()
            int r0 = p221m9.AbstractC4463k.m10151w(r0)
            return r0
        L77:
            m9.q0 r1 = (p221m9.InterfaceC4482q0) r1
            java.util.logging.Logger r0 = p221m9.AbstractC4463k.f18182b
            int r0 = r1.mo10233a()
            return r0
        L80:
            boolean r0 = r1 instanceof p221m9.AbstractC4454h
            if (r0 == 0) goto L8b
            m9.h r1 = (p221m9.AbstractC4454h) r1
            int r0 = p221m9.AbstractC4463k.m10140l(r1)
            return r0
        L8b:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = p221m9.AbstractC4463k.m10130E(r1)
            return r0
        L92:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            java.util.logging.Logger r0 = p221m9.AbstractC4463k.f18182b
            r0 = 1
            return r0
        L9b:
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.intValue()
            goto Lcd
        La1:
            java.lang.Long r1 = (java.lang.Long) r1
            r1.longValue()
            goto Ld6
        La7:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            int r0 = p221m9.AbstractC4463k.m10148t(r0)
            return r0
        Lb2:
            java.lang.Long r1 = (java.lang.Long) r1
            long r0 = r1.longValue()
            int r0 = p221m9.AbstractC4463k.m10135J(r0)
            return r0
        Lbd:
            java.lang.Long r1 = (java.lang.Long) r1
            long r0 = r1.longValue()
            int r0 = p221m9.AbstractC4463k.m10135J(r0)
            return r0
        Lc8:
            java.lang.Float r1 = (java.lang.Float) r1
            r1.floatValue()
        Lcd:
            java.util.logging.Logger r0 = p221m9.AbstractC4463k.f18182b
            r0 = 4
            return r0
        Ld1:
            java.lang.Double r1 = (java.lang.Double) r1
            r1.doubleValue()
        Ld6:
            java.util.logging.Logger r0 = p221m9.AbstractC4463k.f18182b
            r0 = 8
            return r0
    }

    /* renamed from: e */
    public static int m10301e(p221m9.C4490t.a<?> r3, java.lang.Object r4) {
            m9.t1 r0 = r3.mo10315i()
            int r1 = r3.mo10313d()
            boolean r2 = r3.mo10314f()
            if (r2 == 0) goto L4b
            boolean r3 = r3.mo10318n()
            r2 = 0
            java.util.List r4 = (java.util.List) r4
            if (r3 == 0) goto L36
            java.util.Iterator r3 = r4.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r3.next()
            int r4 = m10300d(r0, r4)
            int r2 = r2 + r4
            goto L1b
        L2b:
            int r3 = p221m9.AbstractC4463k.m10131F(r1)
            int r3 = r3 + r2
            int r4 = p221m9.AbstractC4463k.m10133H(r2)
            int r3 = r3 + r4
            return r3
        L36:
            java.util.Iterator r3 = r4.iterator()
        L3a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r3.next()
            int r4 = m10299c(r0, r1, r4)
            int r2 = r2 + r4
            goto L3a
        L4a:
            return r2
        L4b:
            int r3 = m10299c(r0, r1, r4)
            return r3
    }

    /* renamed from: j */
    public static <T extends p221m9.C4490t.a<T>> boolean m10302j(java.util.Map.Entry<T, java.lang.Object> r4) {
            java.lang.Object r0 = r4.getKey()
            m9.t$a r0 = (p221m9.C4490t.a) r0
            m9.u1 r1 = r0.mo10317m()
            m9.u1 r2 = p221m9.EnumC4495u1.f18286h0
            r3 = 1
            if (r1 != r2) goto L4d
            boolean r0 = r0.mo10314f()
            r1 = 0
            java.lang.Object r4 = r4.getValue()
            if (r0 == 0) goto L33
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r4.next()
            m9.q0 r0 = (p221m9.InterfaceC4482q0) r0
            boolean r0 = r0.mo10280j()
            if (r0 != 0) goto L20
            return r1
        L33:
            boolean r0 = r4 instanceof p221m9.InterfaceC4482q0
            if (r0 == 0) goto L40
            m9.q0 r4 = (p221m9.InterfaceC4482q0) r4
            boolean r4 = r4.mo10280j()
            if (r4 != 0) goto L4d
            return r1
        L40:
            boolean r4 = r4 instanceof p221m9.C4440c0
            if (r4 == 0) goto L45
            return r3
        L45:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong object type used with protocol message reflection."
            r4.<init>(r0)
            throw r4
        L4d:
            return r3
    }

    /* renamed from: a */
    public p221m9.C4490t<T> m10303a() {
            r4 = this;
            m9.t r0 = new m9.t
            r0.<init>()
            r1 = 0
        L6:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r2 = r4.f18225a
            int r2 = r2.m10112d()
            if (r1 >= r2) goto L24
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r2 = r4.f18225a
            java.util.Map$Entry r2 = r2.m10111c(r1)
            java.lang.Object r3 = r2.getKey()
            m9.t$a r3 = (p221m9.C4490t.a) r3
            java.lang.Object r2 = r2.getValue()
            r0.m10311n(r3, r2)
            int r1 = r1 + 1
            goto L6
        L24:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r1 = r4.f18225a
            java.lang.Iterable r1 = r1.m10113e()
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            m9.t$a r3 = (p221m9.C4490t.a) r3
            java.lang.Object r2 = r2.getValue()
            r0.m10311n(r3, r2)
            goto L2e
        L48:
            boolean r1 = r4.f18227c
            r0.f18227c = r1
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            m9.t r0 = r1.m10303a()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p221m9.C4490t
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            m9.t r2 = (p221m9.C4490t) r2
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r0 = r1.f18225a
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r2 = r2.f18225a
            boolean r2 = r0.equals(r2)
            return r2
    }

    /* renamed from: f */
    public java.lang.Object m10304f(T r2) {
            r1 = this;
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r0 = r1.f18225a
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof p221m9.C4440c0
            if (r0 == 0) goto L10
            m9.c0 r2 = (p221m9.C4440c0) r2
            m9.q0 r2 = r2.m9911c()
        L10:
            return r2
    }

    /* renamed from: g */
    public final int m10305g(java.util.Map.Entry<T, java.lang.Object> r6) {
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            m9.t$a r0 = (p221m9.C4490t.a) r0
            java.lang.Object r1 = r6.getValue()
            m9.u1 r2 = r0.mo10317m()
            m9.u1 r3 = p221m9.EnumC4495u1.f18286h0
            if (r2 != r3) goto L63
            boolean r2 = r0.mo10314f()
            if (r2 != 0) goto L63
            boolean r2 = r0.mo10318n()
            if (r2 != 0) goto L63
            boolean r0 = r1 instanceof p221m9.C4440c0
            r2 = 3
            r3 = 1
            r4 = 2
            java.lang.Object r6 = r6.getKey()
            m9.t$a r6 = (p221m9.C4490t.a) r6
            int r6 = r6.mo10313d()
            if (r0 == 0) goto L47
            m9.c0 r1 = (p221m9.C4440c0) r1
            int r0 = p221m9.AbstractC4463k.m10131F(r3)
            int r0 = r0 * 2
            int r6 = p221m9.AbstractC4463k.m10132G(r4, r6)
            int r6 = r6 + r0
            int r0 = p221m9.AbstractC4463k.m10131F(r2)
            int r1 = p221m9.AbstractC4463k.m10150v(r1)
            int r1 = r1 + r0
            int r1 = r1 + r6
            return r1
        L47:
            m9.q0 r1 = (p221m9.InterfaceC4482q0) r1
            int r0 = p221m9.AbstractC4463k.m10131F(r3)
            int r0 = r0 * 2
            int r6 = p221m9.AbstractC4463k.m10132G(r4, r6)
            int r6 = r6 + r0
            int r0 = p221m9.AbstractC4463k.m10131F(r2)
            int r1 = r1.mo10233a()
            int r1 = p221m9.AbstractC4463k.m10151w(r1)
            int r1 = r1 + r0
            int r1 = r1 + r6
            return r1
        L63:
            int r6 = m10301e(r0, r1)
            return r6
    }

    /* renamed from: h */
    public boolean m10306h() {
            r1 = this;
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r0 = r1.f18225a
            boolean r0 = r0.isEmpty()
            return r0
    }

    public int hashCode() {
            r1 = this;
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r0 = r1.f18225a
            int r0 = r0.hashCode()
            return r0
    }

    /* renamed from: i */
    public boolean m10307i() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r2 = r3.f18225a
            int r2 = r2.m10112d()
            if (r1 >= r2) goto L1a
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r2 = r3.f18225a
            java.util.Map$Entry r2 = r2.m10111c(r1)
            boolean r2 = m10302j(r2)
            if (r2 != 0) goto L17
            return r0
        L17:
            int r1 = r1 + 1
            goto L2
        L1a:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r1 = r3.f18225a
            java.lang.Iterable r1 = r1.m10113e()
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = m10302j(r2)
            if (r2 != 0) goto L24
            return r0
        L37:
            r0 = 1
            return r0
    }

    /* renamed from: k */
    public java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> m10308k() {
            r2 = this;
            boolean r0 = r2.f18227c
            if (r0 == 0) goto L14
            m9.c0$c r0 = new m9.c0$c
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r1 = r2.f18225a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
        L14:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r0 = r2.f18225a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    /* renamed from: l */
    public void m10309l() {
            r1 = this;
            boolean r0 = r1.f18226b
            if (r0 == 0) goto L5
            return
        L5:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r0 = r1.f18225a
            r0.mo10071g()
            r0 = 1
            r1.f18226b = r0
            return
    }

    /* renamed from: m */
    public final void m10310m(java.util.Map.Entry<T, java.lang.Object> r5) {
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            m9.t$a r0 = (p221m9.C4490t.a) r0
            java.lang.Object r5 = r5.getValue()
            boolean r1 = r5 instanceof p221m9.C4440c0
            if (r1 == 0) goto L14
            m9.c0 r5 = (p221m9.C4440c0) r5
            m9.q0 r5 = r5.m9911c()
        L14:
            boolean r1 = r0.mo10314f()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r4.m10304f(r0)
            if (r1 != 0) goto L25
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L25:
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r5.next()
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = m10298b(r2)
            r3.add(r2)
            goto L2b
        L40:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r5 = r4.f18225a
            r5.m10115h(r0, r1)
            goto L73
        L46:
            m9.u1 r1 = r0.mo10317m()
            m9.u1 r2 = p221m9.EnumC4495u1.f18286h0
            if (r1 != r2) goto L6a
            java.lang.Object r1 = r4.m10304f(r0)
            if (r1 != 0) goto L55
            goto L6a
        L55:
            m9.q0 r1 = (p221m9.InterfaceC4482q0) r1
            m9.q0$a r1 = r1.mo10234c()
            m9.q0 r5 = (p221m9.InterfaceC4482q0) r5
            m9.q0$a r5 = r0.mo10316j(r1, r5)
            m9.x$a r5 = (p221m9.AbstractC4501x.a) r5
            m9.x r5 = r5.m10375k()
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r1 = r4.f18225a
            goto L70
        L6a:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r1 = r4.f18225a
            java.lang.Object r5 = m10298b(r5)
        L70:
            r1.m10115h(r0, r5)
        L73:
            return
    }

    /* renamed from: n */
    public void m10311n(T r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r4.mo10314f()
            if (r0 == 0) goto L34
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L2c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r5 = (java.util.List) r5
            r0.addAll(r5)
            java.util.Iterator r5 = r0.iterator()
        L18:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r5.next()
            m9.t1 r2 = r4.mo10315i()
            r3.m10312o(r2, r1)
            goto L18
        L2a:
            r5 = r0
            goto L3b
        L2c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Wrong object type used with protocol message reflection."
            r4.<init>(r5)
            throw r4
        L34:
            m9.t1 r0 = r4.mo10315i()
            r3.m10312o(r0, r5)
        L3b:
            boolean r0 = r5 instanceof p221m9.C4440c0
            if (r0 == 0) goto L42
            r0 = 1
            r3.f18227c = r0
        L42:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r0 = r3.f18225a
            r0.m10115h(r4, r5)
            return
    }

    /* renamed from: o */
    public final void m10312o(p221m9.EnumC4492t1 r3, java.lang.Object r4) {
            r2 = this;
            java.nio.charset.Charset r0 = p221m9.C4505z.f18308a
            java.util.Objects.requireNonNull(r4)
            m9.u1 r3 = r3.f18266Y
            int r3 = r3.ordinal()
            r0 = 1
            r1 = 0
            switch(r3) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L35;
                case 4: goto L32;
                case 5: goto L2f;
                case 6: goto L23;
                case 7: goto L1a;
                case 8: goto L11;
                default: goto L10;
            }
        L10:
            goto L40
        L11:
            boolean r3 = r4 instanceof p221m9.InterfaceC4482q0
            if (r3 != 0) goto L2d
            boolean r3 = r4 instanceof p221m9.C4440c0
            if (r3 == 0) goto L2c
            goto L2d
        L1a:
            boolean r3 = r4 instanceof java.lang.Integer
            if (r3 != 0) goto L2d
            boolean r3 = r4 instanceof p221m9.C4505z.a
            if (r3 == 0) goto L2c
            goto L2d
        L23:
            boolean r3 = r4 instanceof p221m9.AbstractC4454h
            if (r3 != 0) goto L2d
            boolean r3 = r4 instanceof byte[]
            if (r3 == 0) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r1 = r0
            goto L40
        L2f:
            boolean r1 = r4 instanceof java.lang.String
            goto L40
        L32:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L40
        L35:
            boolean r1 = r4 instanceof java.lang.Double
            goto L40
        L38:
            boolean r1 = r4 instanceof java.lang.Float
            goto L40
        L3b:
            boolean r1 = r4 instanceof java.lang.Long
            goto L40
        L3e:
            boolean r1 = r4 instanceof java.lang.Integer
        L40:
            if (r1 == 0) goto L43
            return
        L43:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Wrong object type used with protocol message reflection."
            r3.<init>(r4)
            throw r3
    }
}
