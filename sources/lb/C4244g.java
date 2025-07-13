package lb;

/* renamed from: lb.g */
/* loaded from: classes.dex */
public final class C4244g {

    /* renamed from: a */
    public final java.util.Map<java.lang.reflect.Type, p169jb.InterfaceC3469l<?>> f17417a;

    /* renamed from: b */
    public final p253ob.AbstractC5188b f17418b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: lb.g$a */
    public class a<T> implements lb.InterfaceC4256s<T> {

        /* renamed from: a */
        public final /* synthetic */ p169jb.InterfaceC3469l f17419a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.reflect.Type f17420b;

        public a(lb.C4244g r1, p169jb.InterfaceC3469l r2, java.lang.reflect.Type r3) {
                r0 = this;
                r0.f17419a = r2
                r0.f17420b = r3
                r0.<init>()
                return
        }

        @Override // lb.InterfaceC4256s
        /* renamed from: a */
        public T mo9554a() {
                r2 = this;
                jb.l r0 = r2.f17419a
                java.lang.reflect.Type r1 = r2.f17420b
                java.lang.Object r0 = r0.m7940a(r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: lb.g$b */
    public class b<T> implements lb.InterfaceC4256s<T> {

        /* renamed from: a */
        public final /* synthetic */ p169jb.InterfaceC3469l f17421a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.reflect.Type f17422b;

        public b(lb.C4244g r1, p169jb.InterfaceC3469l r2, java.lang.reflect.Type r3) {
                r0 = this;
                r0.f17421a = r2
                r0.f17422b = r3
                r0.<init>()
                return
        }

        @Override // lb.InterfaceC4256s
        /* renamed from: a */
        public T mo9554a() {
                r2 = this;
                jb.l r0 = r2.f17421a
                java.lang.reflect.Type r1 = r2.f17422b
                java.lang.Object r0 = r0.m7940a(r1)
                return r0
        }
    }

    public C4244g(java.util.Map<java.lang.reflect.Type, p169jb.InterfaceC3469l<?>> r2) {
            r1 = this;
            r1.<init>()
            ob.b r0 = p253ob.AbstractC5188b.f20334a
            r1.f17418b = r0
            r1.f17417a = r2
            return
    }

    /* renamed from: a */
    public <T> lb.InterfaceC4256s<T> m9555a(p274pb.C5380a<T> r6) {
            r5 = this;
            java.lang.reflect.Type r0 = r6.f21382b
            java.lang.Class<? super T> r6 = r6.f21381a
            java.util.Map<java.lang.reflect.Type, jb.l<?>> r1 = r5.f17417a
            java.lang.Object r1 = r1.get(r0)
            jb.l r1 = (p169jb.InterfaceC3469l) r1
            if (r1 == 0) goto L14
            lb.g$a r6 = new lb.g$a
            r6.<init>(r5, r1, r0)
            return r6
        L14:
            java.util.Map<java.lang.reflect.Type, jb.l<?>> r1 = r5.f17417a
            java.lang.Object r1 = r1.get(r6)
            jb.l r1 = (p169jb.InterfaceC3469l) r1
            if (r1 == 0) goto L24
            lb.g$b r6 = new lb.g$b
            r6.<init>(r5, r1, r0)
            return r6
        L24:
            r1 = 0
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L3d
            java.lang.reflect.Constructor r3 = r6.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L3d
            boolean r4 = r3.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L3d
            if (r4 != 0) goto L37
            ob.b r4 = r5.f17418b     // Catch: java.lang.NoSuchMethodException -> L3d
            r4.mo11504a(r3)     // Catch: java.lang.NoSuchMethodException -> L3d
        L37:
            lb.h r4 = new lb.h     // Catch: java.lang.NoSuchMethodException -> L3d
            r4.<init>(r5, r3)     // Catch: java.lang.NoSuchMethodException -> L3d
            goto L3e
        L3d:
            r4 = r1
        L3e:
            if (r4 == 0) goto L41
            return r4
        L41:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = r3.isAssignableFrom(r6)
            if (r3 == 0) goto L8a
            java.lang.Class<java.util.SortedSet> r1 = java.util.SortedSet.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L58
            lb.i r1 = new lb.i
            r1.<init>(r5)
            goto Lea
        L58:
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L67
            lb.j r1 = new lb.j
            r1.<init>(r5, r0)
            goto Lea
        L67:
            java.lang.Class<java.util.Set> r1 = java.util.Set.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L76
            lb.k r1 = new lb.k
            r1.<init>(r5)
            goto Lea
        L76:
            java.lang.Class<java.util.Queue> r1 = java.util.Queue.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L84
            lb.l r1 = new lb.l
            r1.<init>(r5)
            goto Lea
        L84:
            lb.m r1 = new lb.m
            r1.<init>(r5)
            goto Lea
        L8a:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r6)
            if (r3 == 0) goto Lea
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r1 = java.util.concurrent.ConcurrentNavigableMap.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto La0
            lb.n r1 = new lb.n
            r1.<init>(r5)
            goto Lea
        La0:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r1 = java.util.concurrent.ConcurrentMap.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto Lae
            lb.b r1 = new lb.b
            r1.<init>(r5)
            goto Lea
        Lae:
            java.lang.Class<java.util.SortedMap> r1 = java.util.SortedMap.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto Lbc
            lb.c r1 = new lb.c
            r1.<init>(r5)
            goto Lea
        Lbc:
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto Le5
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r3 = r0
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r2 = r3[r2]
            java.util.Objects.requireNonNull(r2)
            java.lang.reflect.Type r2 = lb.C4238a.m9545a(r2)
            java.lang.Class r3 = lb.C4238a.m9549e(r2)
            r2.hashCode()
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 != 0) goto Le5
            lb.d r1 = new lb.d
            r1.<init>(r5)
            goto Lea
        Le5:
            lb.e r1 = new lb.e
            r1.<init>(r5)
        Lea:
            if (r1 == 0) goto Led
            return r1
        Led:
            lb.f r1 = new lb.f
            r1.<init>(r5, r6, r0)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Map<java.lang.reflect.Type, jb.l<?>> r0 = r1.f17417a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
