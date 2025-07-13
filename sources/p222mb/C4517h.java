package p222mb;

/* renamed from: mb.h */
/* loaded from: classes.dex */
public final class C4517h extends p169jb.AbstractC3483z<java.lang.Object> {

    /* renamed from: b */
    public static final p169jb.InterfaceC3458a0 f18340b = null;

    /* renamed from: a */
    public final p169jb.C3467j f18341a;

    /* renamed from: mb.h$a */
    public class a implements p169jb.InterfaceC3458a0 {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.InterfaceC3458a0
        /* renamed from: a */
        public <T> p169jb.AbstractC3483z<T> mo7921a(p169jb.C3467j r2, p274pb.C5380a<T> r3) {
                r1 = this;
                java.lang.Class<? super T> r3 = r3.f21381a
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                if (r3 != r0) goto Lc
                mb.h r3 = new mb.h
                r3.<init>(r2)
                return r3
            Lc:
                r2 = 0
                return r2
        }
    }

    static {
            mb.h$a r0 = new mb.h$a
            r0.<init>()
            p222mb.C4517h.f18340b = r0
            return
    }

    public C4517h(p169jb.C3467j r1) {
            r0 = this;
            r0.<init>()
            r0.f18341a = r1
            return
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: a */
    public java.lang.Object mo7919a(p290qb.C5612a r4) {
            r3 = this;
            qb.b r0 = r4.mo10414z0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L5a
            r1 = 2
            if (r0 == r1) goto L3c
            r1 = 5
            if (r0 == r1) goto L37
            r1 = 6
            if (r0 == r1) goto L2e
            r1 = 7
            if (r0 == r1) goto L25
            r1 = 8
            if (r0 != r1) goto L1f
            r4.mo10411m0()
            r4 = 0
            return r4
        L1f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L25:
            boolean r4 = r4.mo10404V()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L2e:
            double r0 = r4.mo10405Z()
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
        L37:
            java.lang.String r4 = r4.mo10413x0()
            return r4
        L3c:
            lb.r r0 = new lb.r
            r0.<init>()
            r4.mo10410h()
        L44:
            boolean r1 = r4.mo10403Q()
            if (r1 == 0) goto L56
            java.lang.String r1 = r4.mo10409f0()
            java.lang.Object r2 = r3.mo7919a(r4)
            r0.put(r1, r2)
            goto L44
        L56:
            r4.mo10396A()
            return r0
        L5a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mo10406a()
        L62:
            boolean r1 = r4.mo10403Q()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r3.mo7919a(r4)
            r0.add(r1)
            goto L62
        L70:
            r4.mo10412n()
            return r0
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: b */
    public void mo7920b(p290qb.C5614c r4, java.lang.Object r5) {
            r3 = this;
            if (r5 != 0) goto L6
            r4.mo10417R()
            return
        L6:
            jb.j r0 = r3.f18341a
            java.lang.Class r1 = r5.getClass()
            java.util.Objects.requireNonNull(r0)
            pb.a r2 = new pb.a
            r2.<init>(r1)
            jb.z r0 = r0.m7931e(r2)
            boolean r1 = r0 instanceof p222mb.C4517h
            if (r1 == 0) goto L23
            r4.mo10421i()
            r4.mo10415A()
            return
        L23:
            r0.mo7920b(r4, r5)
            return
    }
}
