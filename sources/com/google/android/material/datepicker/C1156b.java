package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C1156b {

    /* renamed from: a */
    public final android.graphics.Rect f6055a;

    /* renamed from: b */
    public final android.content.res.ColorStateList f6056b;

    /* renamed from: c */
    public final android.content.res.ColorStateList f6057c;

    /* renamed from: d */
    public final android.content.res.ColorStateList f6058d;

    /* renamed from: e */
    public final int f6059e;

    /* renamed from: f */
    public final p340t8.C6192i f6060f;

    public C1156b(android.content.res.ColorStateList r2, android.content.res.ColorStateList r3, android.content.res.ColorStateList r4, int r5, p340t8.C6192i r6, android.graphics.Rect r7) {
            r1 = this;
            r1.<init>()
            int r0 = r7.left
            p064e.C1487a.m4026d(r0)
            int r0 = r7.top
            p064e.C1487a.m4026d(r0)
            int r0 = r7.right
            p064e.C1487a.m4026d(r0)
            int r0 = r7.bottom
            p064e.C1487a.m4026d(r0)
            r1.f6055a = r7
            r1.f6056b = r3
            r1.f6057c = r2
            r1.f6058d = r4
            r1.f6059e = r5
            r1.f6060f = r6
            return
    }

    /* renamed from: a */
    public static com.google.android.material.datepicker.C1156b m3401a(android.content.Context r12, int r13) {
            r0 = 0
            r1 = 1
            if (r13 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r2 == 0) goto L5e
            int[] r2 = p339t7.C6183a.f24026w
            android.content.res.TypedArray r13 = r12.obtainStyledAttributes(r13, r2)
            int r2 = r13.getDimensionPixelOffset(r0, r0)
            r3 = 2
            int r3 = r13.getDimensionPixelOffset(r3, r0)
            int r1 = r13.getDimensionPixelOffset(r1, r0)
            r4 = 3
            int r4 = r13.getDimensionPixelOffset(r4, r0)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>(r2, r3, r1, r4)
            r1 = 4
            android.content.res.ColorStateList r6 = p288q8.C5599c.m11875a(r12, r13, r1)
            r1 = 9
            android.content.res.ColorStateList r7 = p288q8.C5599c.m11875a(r12, r13, r1)
            r1 = 7
            android.content.res.ColorStateList r8 = p288q8.C5599c.m11875a(r12, r13, r1)
            r1 = 8
            int r9 = r13.getDimensionPixelSize(r1, r0)
            r1 = 5
            int r1 = r13.getResourceId(r1, r0)
            r2 = 6
            int r2 = r13.getResourceId(r2, r0)
            t8.a r3 = new t8.a
            float r0 = (float) r0
            r3.<init>(r0)
            t8.i$b r12 = p340t8.C6192i.m12782a(r12, r1, r2, r3)
            t8.i r10 = r12.m12788a()
            r13.recycle()
            com.google.android.material.datepicker.b r12 = new com.google.android.material.datepicker.b
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r12
        L5e:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Cannot create a CalendarItemStyle with a styleResId of 0"
            r12.<init>(r13)
            throw r12
    }

    /* renamed from: b */
    public void m3402b(android.widget.TextView r10) {
            r9 = this;
            t8.f r0 = new t8.f
            r0.<init>()
            t8.f r1 = new t8.f
            r1.<init>()
            t8.i r2 = r9.f6060f
            r0.setShapeAppearanceModel(r2)
            t8.i r2 = r9.f6060f
            r1.setShapeAppearanceModel(r2)
            android.content.res.ColorStateList r2 = r9.f6057c
            r0.m12773q(r2)
            int r2 = r9.f6059e
            float r2 = (float) r2
            android.content.res.ColorStateList r3 = r9.f6058d
            r0.m12777u(r2, r3)
            android.content.res.ColorStateList r2 = r9.f6056b
            r10.setTextColor(r2)
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r2 = r9.f6056b
            r3 = 30
            android.content.res.ColorStateList r2 = r2.withAlpha(r3)
            r4.<init>(r2, r0, r1)
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.Rect r1 = r9.f6055a
            int r5 = r1.left
            int r6 = r1.top
            int r7 = r1.right
            int r8 = r1.bottom
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r10, r0)
            return
    }
}
