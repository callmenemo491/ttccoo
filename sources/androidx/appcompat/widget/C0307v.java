package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
public class C0307v extends androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0 {

    /* renamed from: h0 */
    public final /* synthetic */ androidx.appcompat.widget.C0309w.d f1446h0;

    /* renamed from: i0 */
    public final /* synthetic */ androidx.appcompat.widget.C0309w f1447i0;

    public C0307v(androidx.appcompat.widget.C0309w r1, android.view.View r2, androidx.appcompat.widget.C0309w.d r3) {
            r0 = this;
            r0.f1447i0 = r1
            r0.f1446h0 = r3
            r0.<init>(r2)
            return
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0
    /* renamed from: b */
    public p194l.InterfaceC4155f mo462b() {
            r1 = this;
            androidx.appcompat.widget.w$d r0 = r1.f1446h0
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: c */
    public boolean mo463c() {
            r1 = this;
            androidx.appcompat.widget.w r0 = r1.f1447i0
            androidx.appcompat.widget.w$f r0 = r0.getInternalPopup()
            boolean r0 = r0.mo796b()
            if (r0 != 0) goto L11
            androidx.appcompat.widget.w r0 = r1.f1447i0
            r0.m795b()
        L11:
            r0 = 1
            return r0
    }
}
