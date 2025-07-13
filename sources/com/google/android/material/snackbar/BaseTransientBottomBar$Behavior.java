package com.google.android.material.snackbar;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends com.google.android.material.behavior.SwipeDismissBehavior<android.view.View> {

    /* renamed from: h */
    public final p355u8.C6360a f6254h;

    public BaseTransientBottomBar$Behavior() {
            r1 = this;
            r1.<init>()
            u8.a r0 = new u8.a
            r0.<init>(r1)
            r1.f6254h = r0
            return
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: g */
    public boolean mo991g(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
            r2 = this;
            u8.a r0 = r2.f6254h
            java.util.Objects.requireNonNull(r0)
            int r0 = r5.getActionMasked()
            if (r0 == 0) goto L27
            r1 = 1
            if (r0 == r1) goto L12
            r1 = 3
            if (r0 == r1) goto L12
            goto L4c
        L12:
            u8.e r0 = p355u8.C6364e.f24830c
            if (r0 != 0) goto L1d
            u8.e r0 = new u8.e
            r0.<init>()
            p355u8.C6364e.f24830c = r0
        L1d:
            u8.e r0 = p355u8.C6364e.f24830c
            java.lang.Object r0 = r0.f24831a
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            goto L4c
        L24:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r3
        L27:
            float r0 = r5.getX()
            int r0 = (int) r0
            float r1 = r5.getY()
            int r1 = (int) r1
            boolean r0 = r3.m974p(r4, r0, r1)
            if (r0 == 0) goto L4c
            u8.e r0 = p355u8.C6364e.f24830c
            if (r0 != 0) goto L42
            u8.e r0 = new u8.e
            r0.<init>()
            p355u8.C6364e.f24830c = r0
        L42:
            u8.e r0 = p355u8.C6364e.f24830c
            java.lang.Object r0 = r0.f24831a
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r3
        L4c:
            boolean r3 = super.mo991g(r3, r4, r5)
            return r3
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: s */
    public boolean mo3261s(android.view.View r2) {
            r1 = this;
            u8.a r0 = r1.f6254h
            java.util.Objects.requireNonNull(r0)
            boolean r2 = r2 instanceof p355u8.C6363d
            return r2
    }
}
