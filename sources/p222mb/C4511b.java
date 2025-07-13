package p222mb;

/* renamed from: mb.b */
/* loaded from: classes.dex */
public final class C4511b implements p169jb.InterfaceC3458a0 {

    /* renamed from: Y */
    public final lb.C4244g f18318Y;

    /* renamed from: mb.b$a */
    public static final class a<E> extends p169jb.AbstractC3483z<java.util.Collection<E>> {

        /* renamed from: a */
        public final p169jb.AbstractC3483z<E> f18319a;

        /* renamed from: b */
        public final lb.InterfaceC4256s<? extends java.util.Collection<E>> f18320b;

        public a(p169jb.C3467j r2, java.lang.reflect.Type r3, p169jb.AbstractC3483z<E> r4, lb.InterfaceC4256s<? extends java.util.Collection<E>> r5) {
                r1 = this;
                r1.<init>()
                mb.n r0 = new mb.n
                r0.<init>(r2, r4, r3)
                r1.f18319a = r0
                r1.f18320b = r5
                return
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: a */
        public java.lang.Object mo7919a(p290qb.C5612a r3) {
                r2 = this;
                qb.b r0 = r3.mo10414z0()
                qb.b r1 = p290qb.EnumC5613b.f21798g0
                if (r0 != r1) goto Ld
                r3.mo10411m0()
                r3 = 0
                goto L2c
            Ld:
                lb.s<? extends java.util.Collection<E>> r0 = r2.f18320b
                java.lang.Object r0 = r0.mo9554a()
                java.util.Collection r0 = (java.util.Collection) r0
                r3.mo10406a()
            L18:
                boolean r1 = r3.mo10403Q()
                if (r1 == 0) goto L28
                jb.z<E> r1 = r2.f18319a
                java.lang.Object r1 = r1.mo7919a(r3)
                r0.add(r1)
                goto L18
            L28:
                r3.mo10412n()
                r3 = r0
            L2c:
                return r3
        }

        @Override // p169jb.AbstractC3483z
        /* renamed from: b */
        public void mo7920b(p290qb.C5614c r3, java.lang.Object r4) {
                r2 = this;
                java.util.Collection r4 = (java.util.Collection) r4
                if (r4 != 0) goto L8
                r3.mo10417R()
                goto L22
            L8:
                r3.mo10420h()
                java.util.Iterator r4 = r4.iterator()
            Lf:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L1f
                java.lang.Object r0 = r4.next()
                jb.z<E> r1 = r2.f18319a
                r1.mo7920b(r3, r0)
                goto Lf
            L1f:
                r3.mo10424n()
            L22:
                return
        }
    }

    public C4511b(lb.C4244g r1) {
            r0 = this;
            r0.<init>()
            r0.f18318Y = r1
            return
    }

    @Override // p169jb.InterfaceC3458a0
    /* renamed from: a */
    public <T> p169jb.AbstractC3483z<T> mo7921a(p169jb.C3467j r4, p274pb.C5380a<T> r5) {
            r3 = this;
            java.lang.reflect.Type r0 = r5.f21382b
            java.lang.Class<? super T> r1 = r5.f21381a
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 != 0) goto Le
            r4 = 0
            return r4
        Le:
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            java.lang.reflect.Type r0 = lb.C4238a.m9550f(r0, r1, r2)
            boolean r1 = r0 instanceof java.lang.reflect.WildcardType
            r2 = 0
            if (r1 == 0) goto L21
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            r0 = r0[r2]
        L21:
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L2e
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r0 = r0[r2]
            goto L30
        L2e:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
        L30:
            pb.a r1 = new pb.a
            r1.<init>(r0)
            jb.z r1 = r4.m7931e(r1)
            lb.g r2 = r3.f18318Y
            lb.s r5 = r2.m9555a(r5)
            mb.b$a r2 = new mb.b$a
            r2.<init>(r4, r0, r1, r5)
            return r2
    }
}
