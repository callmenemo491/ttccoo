package androidx.lifecycle;

/* renamed from: androidx.lifecycle.b0 */
/* loaded from: classes.dex */
public class C0433b0<T> extends androidx.lifecycle.C0437d0<T> {

    /* renamed from: l */
    public p226n.C4640b<androidx.lifecycle.LiveData<?>, androidx.lifecycle.C0433b0.a<?>> f2472l;

    /* renamed from: androidx.lifecycle.b0$a */
    public static class a<V> implements androidx.lifecycle.InterfaceC0439e0<V> {

        /* renamed from: a */
        public final androidx.lifecycle.LiveData<V> f2473a;

        /* renamed from: b */
        public final androidx.lifecycle.InterfaceC0439e0<? super V> f2474b;

        /* renamed from: c */
        public int f2475c;

        public a(androidx.lifecycle.LiveData<V> r2, androidx.lifecycle.InterfaceC0439e0<? super V> r3) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f2475c = r0
                r1.f2473a = r2
                r1.f2474b = r3
                return
        }

        @Override // androidx.lifecycle.InterfaceC0439e0
        /* renamed from: d */
        public void mo124d(V r3) {
                r2 = this;
                int r0 = r2.f2475c
                androidx.lifecycle.LiveData<V> r1 = r2.f2473a
                int r1 = r1.f2444g
                if (r0 == r1) goto Lf
                r2.f2475c = r1
                androidx.lifecycle.e0<? super V> r0 = r2.f2474b
                r0.mo124d(r3)
            Lf:
                return
        }
    }

    public C0433b0() {
            r1 = this;
            r1.<init>()
            n.b r0 = new n.b
            r0.<init>()
            r1.f2472l = r0
            return
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: h */
    public void mo4h() {
            r3 = this;
            n.b<androidx.lifecycle.LiveData<?>, androidx.lifecycle.b0$a<?>> r0 = r3.f2472l
            java.util.Iterator r0 = r0.iterator()
        L6:
            r1 = r0
            n.b$e r1 = (p226n.C4640b.e) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.b0$a r1 = (androidx.lifecycle.C0433b0.a) r1
            androidx.lifecycle.LiveData<V> r2 = r1.f2473a
            r2.m1414g(r1)
            goto L6
        L21:
            return
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: i */
    public void mo5i() {
            r3 = this;
            n.b<androidx.lifecycle.LiveData<?>, androidx.lifecycle.b0$a<?>> r0 = r3.f2472l
            java.util.Iterator r0 = r0.iterator()
        L6:
            r1 = r0
            n.b$e r1 = (p226n.C4640b.e) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.b0$a r1 = (androidx.lifecycle.C0433b0.a) r1
            androidx.lifecycle.LiveData<V> r2 = r1.f2473a
            r2.mo6k(r1)
            goto L6
        L21:
            return
    }

    /* renamed from: m */
    public <S> void m1428m(androidx.lifecycle.LiveData<S> r4, androidx.lifecycle.InterfaceC0439e0<? super S> r5) {
            r3 = this;
            androidx.lifecycle.b0$a r0 = new androidx.lifecycle.b0$a
            r0.<init>(r4, r5)
            n.b<androidx.lifecycle.LiveData<?>, androidx.lifecycle.b0$a<?>> r1 = r3.f2472l
            java.lang.Object r1 = r1.mo10455i(r4, r0)
            androidx.lifecycle.b0$a r1 = (androidx.lifecycle.C0433b0.a) r1
            if (r1 == 0) goto L1c
            androidx.lifecycle.e0<? super V> r2 = r1.f2474b
            if (r2 != r5) goto L14
            goto L1c
        L14:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This source was already added with the different observer"
            r4.<init>(r5)
            throw r4
        L1c:
            if (r1 == 0) goto L1f
            return
        L1f:
            boolean r5 = r3.m1412e()
            if (r5 == 0) goto L28
            r4.m1414g(r0)
        L28:
            return
    }
}
