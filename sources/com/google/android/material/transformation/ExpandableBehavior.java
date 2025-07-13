package com.google.android.material.transformation;

@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c<android.view.View> {

    /* renamed from: a */
    public int f6550a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class ViewTreeObserverOnPreDrawListenerC1232a implements android.view.ViewTreeObserver.OnPreDrawListener {

        /* renamed from: Y */
        public final /* synthetic */ android.view.View f6551Y;

        /* renamed from: Z */
        public final /* synthetic */ int f6552Z;

        /* renamed from: a0 */
        public final /* synthetic */ p186k8.InterfaceC4072a f6553a0;

        /* renamed from: b0 */
        public final /* synthetic */ com.google.android.material.transformation.ExpandableBehavior f6554b0;

        public ViewTreeObserverOnPreDrawListenerC1232a(com.google.android.material.transformation.ExpandableBehavior r1, android.view.View r2, int r3, p186k8.InterfaceC4072a r4) {
                r0 = this;
                r0.f6554b0 = r1
                r0.f6551Y = r2
                r0.f6552Z = r3
                r0.f6553a0 = r4
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r5 = this;
                android.view.View r0 = r5.f6551Y
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnPreDrawListener(r5)
                com.google.android.material.transformation.ExpandableBehavior r0 = r5.f6554b0
                int r1 = r0.f6550a
                int r2 = r5.f6552Z
                r3 = 0
                if (r1 != r2) goto L20
                k8.a r1 = r5.f6553a0
                r2 = r1
                android.view.View r2 = (android.view.View) r2
                android.view.View r4 = r5.f6551Y
                boolean r1 = r1.mo3450a()
                r0.mo3616t(r2, r4, r1, r3)
            L20:
                return r3
        }
    }

    public ExpandableBehavior() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6550a = r0
            return
    }

    public ExpandableBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f6550a = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: d */
    public boolean mo988d(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            r1 = this;
            k8.a r4 = (p186k8.InterfaceC4072a) r4
            boolean r2 = r4.mo3450a()
            boolean r2 = r1.m3615s(r2)
            if (r2 == 0) goto L24
            boolean r2 = r4.mo3450a()
            r0 = 1
            if (r2 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 2
        L16:
            r1.f6550a = r2
            r2 = r4
            android.view.View r2 = (android.view.View) r2
            boolean r4 = r4.mo3450a()
            boolean r2 = r1.mo3616t(r2, r3, r4, r0)
            return r2
        L24:
            r2 = 0
            return r2
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: h */
    public boolean mo992h(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8) {
            r5 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r8 = p227n0.C4661t.f18570a
            boolean r8 = p227n0.C4661t.f.m10588c(r7)
            r0 = 0
            if (r8 != 0) goto L4a
            java.util.List r8 = r6.m968e(r7)
            int r1 = r8.size()
            r2 = 0
        L12:
            if (r2 >= r1) goto L26
            java.lang.Object r3 = r8.get(r2)
            android.view.View r3 = (android.view.View) r3
            boolean r4 = r5.mo986b(r6, r7, r3)
            if (r4 == 0) goto L23
            k8.a r3 = (p186k8.InterfaceC4072a) r3
            goto L27
        L23:
            int r2 = r2 + 1
            goto L12
        L26:
            r3 = 0
        L27:
            if (r3 == 0) goto L4a
            boolean r6 = r3.mo3450a()
            boolean r6 = r5.m3615s(r6)
            if (r6 == 0) goto L4a
            boolean r6 = r3.mo3450a()
            if (r6 == 0) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 2
        L3c:
            r5.f6550a = r6
            android.view.ViewTreeObserver r8 = r7.getViewTreeObserver()
            com.google.android.material.transformation.ExpandableBehavior$a r1 = new com.google.android.material.transformation.ExpandableBehavior$a
            r1.<init>(r5, r7, r6, r3)
            r8.addOnPreDrawListener(r1)
        L4a:
            return r0
    }

    /* renamed from: s */
    public final boolean m3615s(boolean r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto Ld
            int r4 = r3.f6550a
            if (r4 == 0) goto Lb
            r2 = 2
            if (r4 != r2) goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
        Ld:
            int r4 = r3.f6550a
            if (r4 != r1) goto L12
            r0 = 1
        L12:
            return r0
    }

    /* renamed from: t */
    public abstract boolean mo3616t(android.view.View r1, android.view.View r2, boolean r3, boolean r4);
}
