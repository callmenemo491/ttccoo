package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {

    /* renamed from: a0 */
    public int f1172a0;

    /* renamed from: b0 */
    public int f1173b0;

    /* renamed from: c0 */
    public java.lang.ref.WeakReference<android.view.View> f1174c0;

    /* renamed from: d0 */
    public android.view.LayoutInflater f1175d0;

    /* renamed from: e0 */
    public androidx.appcompat.widget.ViewStubCompat.InterfaceC0257a f1176e0;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface InterfaceC0257a {
        /* renamed from: a */
        void m647a(androidx.appcompat.widget.ViewStubCompat r1, android.view.View r2);
    }

    public ViewStubCompat(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            r3.f1172a0 = r0
            int[] r1 = p064e.C1495i.f7257A
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r0)
            r5 = 2
            r1 = -1
            int r5 = r4.getResourceId(r5, r1)
            r3.f1173b0 = r5
            r5 = 1
            int r2 = r4.getResourceId(r5, r0)
            r3.f1172a0 = r2
            int r0 = r4.getResourceId(r0, r1)
            r3.setId(r0)
            r4.recycle()
            r4 = 8
            r3.setVisibility(r4)
            r3.setWillNotDraw(r5)
            return
    }

    /* renamed from: a */
    public android.view.View m646a() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L55
            int r1 = r4.f1172a0
            if (r1 == 0) goto L4d
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.LayoutInflater r1 = r4.f1175d0
            if (r1 == 0) goto L13
            goto L1b
        L13:
            android.content.Context r1 = r4.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
        L1b:
            int r2 = r4.f1172a0
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r0, r3)
            int r2 = r4.f1173b0
            r3 = -1
            if (r2 == r3) goto L2a
            r1.setId(r2)
        L2a:
            int r2 = r0.indexOfChild(r4)
            r0.removeViewInLayout(r4)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            if (r3 == 0) goto L3b
            r0.addView(r1, r2, r3)
            goto L3e
        L3b:
            r0.addView(r1, r2)
        L3e:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r4.f1174c0 = r0
            androidx.appcompat.widget.ViewStubCompat$a r0 = r4.f1176e0
            if (r0 == 0) goto L4c
            r0.m647a(r4, r1)
        L4c:
            return r1
        L4d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "ViewStub must have a valid layoutResource"
            r0.<init>(r1)
            throw r0
        L55:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ViewStub must have a non-null ViewGroup viewParent"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.View
    public void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    @android.annotation.SuppressLint({"MissingSuperCall"})
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    public int getInflatedId() {
            r1 = this;
            int r0 = r1.f1173b0
            return r0
    }

    public android.view.LayoutInflater getLayoutInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f1175d0
            return r0
    }

    public int getLayoutResource() {
            r1 = this;
            int r0 = r1.f1172a0
            return r0
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setInflatedId(int r1) {
            r0 = this;
            r0.f1173b0 = r1
            return
    }

    public void setLayoutInflater(android.view.LayoutInflater r1) {
            r0 = this;
            r0.f1175d0 = r1
            return
    }

    public void setLayoutResource(int r1) {
            r0 = this;
            r0.f1172a0 = r1
            return
    }

    public void setOnInflateListener(androidx.appcompat.widget.ViewStubCompat.InterfaceC0257a r1) {
            r0 = this;
            r0.f1176e0 = r1
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f1174c0
            if (r0 == 0) goto L18
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L10
            r0.setVisibility(r2)
            goto L23
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "setVisibility called on un-referenced view"
            r2.<init>(r0)
            throw r2
        L18:
            super.setVisibility(r2)
            if (r2 == 0) goto L20
            r0 = 4
            if (r2 != r0) goto L23
        L20:
            r1.m646a()
        L23:
            return
    }
}
