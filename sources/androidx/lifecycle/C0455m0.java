package androidx.lifecycle;

/* renamed from: androidx.lifecycle.m0 */
/* loaded from: classes.dex */
public class C0455m0 {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* renamed from: androidx.lifecycle.m0$a */
    public class a<X> implements androidx.lifecycle.InterfaceC0439e0<X> {

        /* renamed from: a */
        public final /* synthetic */ androidx.lifecycle.C0433b0 f2539a;

        /* renamed from: b */
        public final /* synthetic */ p241o.InterfaceC4866a f2540b;

        public a(androidx.lifecycle.C0433b0 r1, p241o.InterfaceC4866a r2) {
                r0 = this;
                r0.f2539a = r1
                r0.f2540b = r2
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.InterfaceC0439e0
        /* renamed from: d */
        public void mo124d(X r3) {
                r2 = this;
                androidx.lifecycle.b0 r0 = r2.f2539a
                o.a r1 = r2.f2540b
                java.lang.Object r3 = r1.apply(r3)
                r0.mo7l(r3)
                return
        }
    }

    /* renamed from: a */
    public static <X, Y> androidx.lifecycle.LiveData<Y> m1450a(androidx.lifecycle.LiveData<X> r2, p241o.InterfaceC4866a<X, Y> r3) {
            androidx.lifecycle.b0 r0 = new androidx.lifecycle.b0
            r0.<init>()
            androidx.lifecycle.m0$a r1 = new androidx.lifecycle.m0$a
            r1.<init>(r0, r3)
            r0.m1428m(r2, r1)
            return r0
    }
}
