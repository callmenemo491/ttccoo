package p409x7;

/* renamed from: x7.a */
/* loaded from: classes.dex */
public class C6959a implements p242o0.InterfaceC4870d {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior f27203a;

    public C6959a(com.google.android.material.behavior.SwipeDismissBehavior r1) {
            r0 = this;
            r0.f27203a = r1
            r0.<init>()
            return
    }

    @Override // p242o0.InterfaceC4870d
    /* renamed from: a */
    public boolean mo36a(android.view.View r4, p242o0.InterfaceC4870d.a r5) {
            r3 = this;
            com.google.android.material.behavior.SwipeDismissBehavior r5 = r3.f27203a
            boolean r5 = r5.mo3261s(r4)
            r0 = 0
            if (r5 == 0) goto L36
            java.util.WeakHashMap<android.view.View, n0.w> r5 = p227n0.C4661t.f18570a
            int r5 = p227n0.C4661t.d.m10575d(r4)
            r1 = 1
            if (r5 != r1) goto L14
            r5 = 1
            goto L15
        L14:
            r5 = 0
        L15:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r3.f27203a
            int r2 = r2.f5790c
            if (r2 != 0) goto L1d
            if (r5 != 0) goto L21
        L1d:
            if (r2 != r1) goto L22
            if (r5 != 0) goto L22
        L21:
            r0 = 1
        L22:
            int r5 = r4.getWidth()
            if (r0 == 0) goto L29
            int r5 = -r5
        L29:
            p227n0.C4661t.m10538n(r4, r5)
            r5 = 0
            r4.setAlpha(r5)
            com.google.android.material.behavior.SwipeDismissBehavior r4 = r3.f27203a
            java.util.Objects.requireNonNull(r4)
            return r1
        L36:
            return r0
    }
}
