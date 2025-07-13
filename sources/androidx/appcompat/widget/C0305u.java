package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
public class C0305u extends androidx.appcompat.widget.C0297q {

    /* renamed from: d */
    public final android.widget.SeekBar f1440d;

    /* renamed from: e */
    public android.graphics.drawable.Drawable f1441e;

    /* renamed from: f */
    public android.content.res.ColorStateList f1442f;

    /* renamed from: g */
    public android.graphics.PorterDuff.Mode f1443g;

    /* renamed from: h */
    public boolean f1444h;

    /* renamed from: i */
    public boolean f1445i;

    public C0305u(android.widget.SeekBar r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.f1442f = r0
            r1.f1443g = r0
            r0 = 0
            r1.f1444h = r0
            r1.f1445i = r0
            r1.f1440d = r2
            return
    }

    @Override // androidx.appcompat.widget.C0297q
    /* renamed from: a */
    public void mo774a(android.util.AttributeSet r10, int r11) {
            r9 = this;
            super.mo774a(r10, r11)
            android.widget.SeekBar r0 = r9.f1440d
            android.content.Context r0 = r0.getContext()
            int[] r3 = p064e.C1495i.f7264g
            r8 = 0
            androidx.appcompat.widget.y0 r0 = androidx.appcompat.widget.C0314y0.m848r(r0, r10, r3, r11, r8)
            android.widget.SeekBar r1 = r9.f1440d
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1501b
            r7 = 0
            r4 = r10
            r6 = r11
            p227n0.C4661t.m10545u(r1, r2, r3, r4, r5, r6, r7)
            android.graphics.drawable.Drawable r10 = r0.m856h(r8)
            if (r10 == 0) goto L29
            android.widget.SeekBar r11 = r9.f1440d
            r11.setThumb(r10)
        L29:
            r10 = 1
            android.graphics.drawable.Drawable r11 = r0.m855g(r10)
            android.graphics.drawable.Drawable r1 = r9.f1441e
            if (r1 == 0) goto L36
            r2 = 0
            r1.setCallback(r2)
        L36:
            r9.f1441e = r11
            if (r11 == 0) goto L5c
            android.widget.SeekBar r1 = r9.f1440d
            r11.setCallback(r1)
            android.widget.SeekBar r1 = r9.f1440d
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            int r1 = p227n0.C4661t.d.m10575d(r1)
            p103g0.C2200a.m5787c(r11, r1)
            boolean r1 = r11.isStateful()
            if (r1 == 0) goto L59
            android.widget.SeekBar r1 = r9.f1440d
            int[] r1 = r1.getDrawableState()
            r11.setState(r1)
        L59:
            r9.m791c()
        L5c:
            android.widget.SeekBar r11 = r9.f1440d
            r11.invalidate()
            r11 = 3
            boolean r1 = r0.m864p(r11)
            if (r1 == 0) goto L77
            r1 = -1
            int r11 = r0.m858j(r11, r1)
            android.graphics.PorterDuff$Mode r1 = r9.f1443g
            android.graphics.PorterDuff$Mode r11 = androidx.appcompat.widget.C0271e0.m710d(r11, r1)
            r9.f1443g = r11
            r9.f1445i = r10
        L77:
            r11 = 2
            boolean r1 = r0.m864p(r11)
            if (r1 == 0) goto L86
            android.content.res.ColorStateList r11 = r0.m851c(r11)
            r9.f1442f = r11
            r9.f1444h = r10
        L86:
            android.content.res.TypedArray r10 = r0.f1501b
            r10.recycle()
            r9.m791c()
            return
    }

    /* renamed from: c */
    public final void m791c() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1441e
            if (r0 == 0) goto L3d
            boolean r1 = r2.f1444h
            if (r1 != 0) goto Lc
            boolean r1 = r2.f1445i
            if (r1 == 0) goto L3d
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5792h(r0)
            r2.f1441e = r0
            boolean r1 = r2.f1444h
            if (r1 == 0) goto L1f
            android.content.res.ColorStateList r1 = r2.f1442f
            r0.setTintList(r1)
        L1f:
            boolean r0 = r2.f1445i
            if (r0 == 0) goto L2a
            android.graphics.drawable.Drawable r0 = r2.f1441e
            android.graphics.PorterDuff$Mode r1 = r2.f1443g
            r0.setTintMode(r1)
        L2a:
            android.graphics.drawable.Drawable r0 = r2.f1441e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3d
            android.graphics.drawable.Drawable r0 = r2.f1441e
            android.widget.SeekBar r1 = r2.f1440d
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L3d:
            return
    }

    /* renamed from: d */
    public void m792d(android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f1441e
            if (r0 == 0) goto L6a
            android.widget.SeekBar r0 = r6.f1440d
            int r0 = r0.getMax()
            r1 = 1
            if (r0 <= r1) goto L6a
            android.graphics.drawable.Drawable r2 = r6.f1441e
            int r2 = r2.getIntrinsicWidth()
            android.graphics.drawable.Drawable r3 = r6.f1441e
            int r3 = r3.getIntrinsicHeight()
            if (r2 < 0) goto L1e
            int r2 = r2 / 2
            goto L1f
        L1e:
            r2 = 1
        L1f:
            if (r3 < 0) goto L23
            int r1 = r3 / 2
        L23:
            android.graphics.drawable.Drawable r3 = r6.f1441e
            int r4 = -r2
            int r5 = -r1
            r3.setBounds(r4, r5, r2, r1)
            android.widget.SeekBar r1 = r6.f1440d
            int r1 = r1.getWidth()
            android.widget.SeekBar r2 = r6.f1440d
            int r2 = r2.getPaddingLeft()
            int r1 = r1 - r2
            android.widget.SeekBar r2 = r6.f1440d
            int r2 = r2.getPaddingRight()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r2 = (float) r0
            float r1 = r1 / r2
            int r2 = r7.save()
            android.widget.SeekBar r3 = r6.f1440d
            int r3 = r3.getPaddingLeft()
            float r3 = (float) r3
            android.widget.SeekBar r4 = r6.f1440d
            int r4 = r4.getHeight()
            int r4 = r4 / 2
            float r4 = (float) r4
            r7.translate(r3, r4)
            r3 = 0
        L59:
            if (r3 > r0) goto L67
            android.graphics.drawable.Drawable r4 = r6.f1441e
            r4.draw(r7)
            r4 = 0
            r7.translate(r1, r4)
            int r3 = r3 + 1
            goto L59
        L67:
            r7.restoreToCount(r2)
        L6a:
            return
    }
}
