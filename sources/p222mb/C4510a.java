package p222mb;

/* renamed from: mb.a */
/* loaded from: classes.dex */
public final class C4510a<E> extends p169jb.AbstractC3483z<java.lang.Object> {

    /* renamed from: c */
    public static final p169jb.InterfaceC3458a0 f18315c = null;

    /* renamed from: a */
    public final java.lang.Class<E> f18316a;

    /* renamed from: b */
    public final p169jb.AbstractC3483z<E> f18317b;

    /* renamed from: mb.a$a */
    public class a implements p169jb.InterfaceC3458a0 {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.InterfaceC3458a0
        /* renamed from: a */
        public <T> p169jb.AbstractC3483z<T> mo7921a(p169jb.C3467j r3, p274pb.C5380a<T> r4) {
                r2 = this;
                java.lang.reflect.Type r4 = r4.f21382b
                boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
                if (r0 != 0) goto L15
                boolean r1 = r4 instanceof java.lang.Class
                if (r1 == 0) goto L13
                r1 = r4
                java.lang.Class r1 = (java.lang.Class) r1
                boolean r1 = r1.isArray()
                if (r1 != 0) goto L15
            L13:
                r3 = 0
                return r3
            L15:
                if (r0 == 0) goto L1e
                java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
                java.lang.reflect.Type r4 = r4.getGenericComponentType()
                goto L24
            L1e:
                java.lang.Class r4 = (java.lang.Class) r4
                java.lang.Class r4 = r4.getComponentType()
            L24:
                pb.a r0 = new pb.a
                r0.<init>(r4)
                jb.z r0 = r3.m7931e(r0)
                mb.a r1 = new mb.a
                java.lang.Class r4 = lb.C4238a.m9549e(r4)
                r1.<init>(r3, r0, r4)
                return r1
        }
    }

    static {
            mb.a$a r0 = new mb.a$a
            r0.<init>()
            p222mb.C4510a.f18315c = r0
            return
    }

    public C4510a(p169jb.C3467j r2, p169jb.AbstractC3483z<E> r3, java.lang.Class<E> r4) {
            r1 = this;
            r1.<init>()
            mb.n r0 = new mb.n
            r0.<init>(r2, r3, r4)
            r1.f18317b = r0
            r1.f18316a = r4
            return
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: a */
    public java.lang.Object mo7919a(p290qb.C5612a r5) {
            r4 = this;
            qb.b r0 = r5.mo10414z0()
            qb.b r1 = p290qb.EnumC5613b.f21798g0
            if (r0 != r1) goto Ld
            r5.mo10411m0()
            r5 = 0
            return r5
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.mo10406a()
        L15:
            boolean r1 = r5.mo10403Q()
            if (r1 == 0) goto L25
            jb.z<E> r1 = r4.f18317b
            java.lang.Object r1 = r1.mo7919a(r5)
            r0.add(r1)
            goto L15
        L25:
            r5.mo10412n()
            int r5 = r0.size()
            java.lang.Class<E> r1 = r4.f18316a
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            r2 = 0
        L33:
            if (r2 >= r5) goto L3f
            java.lang.Object r3 = r0.get(r2)
            java.lang.reflect.Array.set(r1, r2, r3)
            int r2 = r2 + 1
            goto L33
        L3f:
            return r1
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: b */
    public void mo7920b(p290qb.C5614c r5, java.lang.Object r6) {
            r4 = this;
            if (r6 != 0) goto L6
            r5.mo10417R()
            return
        L6:
            r5.mo10420h()
            r0 = 0
            int r1 = java.lang.reflect.Array.getLength(r6)
        Le:
            if (r0 >= r1) goto L1c
            java.lang.Object r2 = java.lang.reflect.Array.get(r6, r0)
            jb.z<E> r3 = r4.f18317b
            r3.mo7920b(r5, r2)
            int r0 = r0 + 1
            goto Le
        L1c:
            r5.mo10424n()
            return
    }
}
