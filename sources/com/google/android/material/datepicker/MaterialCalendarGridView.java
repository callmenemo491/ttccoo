package com.google.android.material.datepicker;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends android.widget.GridView {

    /* renamed from: a0 */
    public final java.util.Calendar f6039a0;

    /* renamed from: b0 */
    public final boolean f6040b0;

    public MaterialCalendarGridView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            java.util.Calendar r2 = com.google.android.material.datepicker.C1181z.m3444e()
            r1.f6039a0 = r2
            android.content.Context r2 = r1.getContext()
            boolean r2 = com.google.android.material.datepicker.C1169n.m3418M0(r2)
            if (r2 == 0) goto L20
            r2 = 2131361984(0x7f0a00c0, float:1.8343736E38)
            r1.setNextFocusLeftId(r2)
            r2 = 2131362045(0x7f0a00fd, float:1.834386E38)
            r1.setNextFocusRightId(r2)
        L20:
            android.content.Context r2 = r1.getContext()
            r3 = 2130969316(0x7f0402e4, float:1.754731E38)
            boolean r2 = com.google.android.material.datepicker.C1169n.m3419N0(r2, r3)
            r1.f6040b0 = r2
            com.google.android.material.datepicker.m r2 = new com.google.android.material.datepicker.m
            r2.<init>(r1)
            p227n0.C4661t.m10546v(r1, r2)
            return
    }

    /* renamed from: a */
    public com.google.android.material.datepicker.C1174s m3399a() {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            com.google.android.material.datepicker.s r0 = (com.google.android.material.datepicker.C1174s) r0
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public /* bridge */ /* synthetic */ android.widget.Adapter getAdapter() {
            r1 = this;
            com.google.android.material.datepicker.s r0 = r1.m3399a()
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public /* bridge */ /* synthetic */ android.widget.ListAdapter getAdapter() {
            r1 = this;
            com.google.android.material.datepicker.s r0 = r1.m3399a()
            return r0
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.datepicker.s r0 = r1.m3399a()
            r0.notifyDataSetChanged()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r26) {
            r25 = this;
            r0 = r25
            super.onDraw(r26)
            com.google.android.material.datepicker.s r1 = r25.m3399a()
            com.google.android.material.datepicker.c<?> r2 = r1.f6131Z
            h7.ef r3 = r1.f6133b0
            int r4 = r1.m3433b()
            java.lang.Long r4 = r1.m3434c(r4)
            int r5 = r1.m3435d()
            java.lang.Long r5 = r1.m3434c(r5)
            java.util.Collection r2 = r2.m3411z()
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L1a1
            java.lang.Object r6 = r2.next()
            m0.b r6 = (p212m0.C4312b) r6
            F r7 = r6.f17582a
            if (r7 == 0) goto L199
            S r8 = r6.f17583b
            if (r8 != 0) goto L3a
            goto L25
        L3a:
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            S r6 = r6.f17583b
            java.lang.Long r6 = (java.lang.Long) r6
            long r9 = r6.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            java.lang.Long r11 = java.lang.Long.valueOf(r9)
            r13 = 1
            if (r4 == 0) goto L75
            if (r5 == 0) goto L75
            if (r6 == 0) goto L75
            if (r11 != 0) goto L5a
            goto L75
        L5a:
            long r14 = r6.longValue()
            long r16 = r5.longValue()
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 > 0) goto L75
            long r14 = r11.longValue()
            long r16 = r4.longValue()
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 >= 0) goto L73
            goto L75
        L73:
            r6 = 0
            goto L76
        L75:
            r6 = 1
        L76:
            if (r6 == 0) goto L79
            goto L25
        L79:
            boolean r6 = p220m8.C4430n.m9886d(r25)
            long r14 = r4.longValue()
            r11 = 5
            int r16 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r16 >= 0) goto Lab
            int r7 = r1.m3433b()
            com.google.android.material.datepicker.r r8 = r1.f6130Y
            int r8 = r8.f6125b0
            int r8 = r7 % r8
            if (r8 != 0) goto L94
            r8 = 1
            goto L95
        L94:
            r8 = 0
        L95:
            if (r8 == 0) goto L99
            r8 = 0
            goto Lc9
        L99:
            int r8 = r7 + (-1)
            android.view.View r8 = r0.getChildAt(r8)
            if (r6 != 0) goto La6
            int r8 = r8.getRight()
            goto Lc9
        La6:
            int r8 = r8.getLeft()
            goto Lc9
        Lab:
            java.util.Calendar r14 = r0.f6039a0
            r14.setTimeInMillis(r7)
            java.util.Calendar r7 = r0.f6039a0
            int r7 = r7.get(r11)
            int r7 = r1.m3432a(r7)
            android.view.View r8 = r0.getChildAt(r7)
            int r14 = r8.getLeft()
            int r8 = r8.getWidth()
            int r8 = r8 / 2
            int r8 = r8 + r14
        Lc9:
            long r14 = r5.longValue()
            int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r16 <= 0) goto L100
            int r9 = r1.m3435d()
            int r10 = r25.getChildCount()
            int r10 = r10 - r13
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r9 + 1
            com.google.android.material.datepicker.r r11 = r1.f6130Y
            int r11 = r11.f6125b0
            int r10 = r10 % r11
            if (r10 != 0) goto Le8
            goto Le9
        Le8:
            r13 = 0
        Le9:
            if (r13 == 0) goto Lf0
            int r10 = r25.getWidth()
            goto L11e
        Lf0:
            android.view.View r10 = r0.getChildAt(r9)
            if (r6 != 0) goto Lfb
            int r10 = r10.getRight()
            goto L11e
        Lfb:
            int r10 = r10.getLeft()
            goto L11e
        L100:
            java.util.Calendar r13 = r0.f6039a0
            r13.setTimeInMillis(r9)
            java.util.Calendar r9 = r0.f6039a0
            int r9 = r9.get(r11)
            int r9 = r1.m3432a(r9)
            android.view.View r10 = r0.getChildAt(r9)
            int r11 = r10.getLeft()
            int r10 = r10.getWidth()
            int r10 = r10 / 2
            int r10 = r10 + r11
        L11e:
            long r13 = r1.getItemId(r7)
            int r11 = (int) r13
            long r13 = r1.getItemId(r9)
            int r14 = (int) r13
        L128:
            if (r11 > r14) goto L199
            int r13 = r25.getNumColumns()
            int r13 = r13 * r11
            int r15 = r25.getNumColumns()
            int r15 = r15 + r13
            int r15 = r15 + (-1)
            android.view.View r16 = r0.getChildAt(r13)
            int r17 = r16.getTop()
            java.lang.Object r12 = r3.f11491Y
            com.google.android.material.datepicker.b r12 = (com.google.android.material.datepicker.C1156b) r12
            android.graphics.Rect r12 = r12.f6055a
            int r12 = r12.top
            int r12 = r17 + r12
            int r16 = r16.getBottom()
            java.lang.Object r0 = r3.f11491Y
            com.google.android.material.datepicker.b r0 = (com.google.android.material.datepicker.C1156b) r0
            android.graphics.Rect r0 = r0.f6055a
            int r0 = r0.bottom
            int r0 = r16 - r0
            if (r6 != 0) goto L167
            if (r13 <= r7) goto L15d
            r13 = 0
            goto L15e
        L15d:
            r13 = r8
        L15e:
            if (r9 <= r15) goto L165
            int r15 = r25.getWidth()
            goto L179
        L165:
            r15 = r10
            goto L179
        L167:
            if (r9 <= r15) goto L16b
            r15 = 0
            goto L16c
        L16b:
            r15 = r10
        L16c:
            if (r13 <= r7) goto L173
            int r13 = r25.getWidth()
            goto L174
        L173:
            r13 = r8
        L174:
            r24 = r15
            r15 = r13
            r13 = r24
        L179:
            float r13 = (float) r13
            float r12 = (float) r12
            float r15 = (float) r15
            float r0 = (float) r0
            r16 = r1
            java.lang.Object r1 = r3.f11498f0
            r23 = r1
            android.graphics.Paint r23 = (android.graphics.Paint) r23
            r18 = r26
            r19 = r13
            r20 = r12
            r21 = r15
            r22 = r0
            r18.drawRect(r19, r20, r21, r22, r23)
            int r11 = r11 + 1
            r0 = r25
            r1 = r16
            goto L128
        L199:
            r16 = r1
            r0 = r25
            r1 = r16
            goto L25
        L1a1:
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            if (r1 == 0) goto L24
            r1 = 33
            if (r2 != r1) goto Lf
            com.google.android.material.datepicker.s r1 = r0.m3399a()
            int r1 = r1.m3435d()
            goto L1b
        Lf:
            r1 = 130(0x82, float:1.82E-43)
            if (r2 != r1) goto L1f
            com.google.android.material.datepicker.s r1 = r0.m3399a()
            int r1 = r1.m3433b()
        L1b:
            r0.setSelection(r1)
            goto L28
        L1f:
            r1 = 1
            super.onFocusChanged(r1, r2, r3)
            goto L28
        L24:
            r1 = 0
            super.onFocusChanged(r1, r2, r3)
        L28:
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
            r3 = this;
            boolean r5 = super.onKeyDown(r4, r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            int r5 = r3.getSelectedItemPosition()
            r1 = -1
            r2 = 1
            if (r5 == r1) goto L30
            int r5 = r3.getSelectedItemPosition()
            com.google.android.material.datepicker.s r1 = r3.m3399a()
            int r1 = r1.m3433b()
            if (r5 < r1) goto L1f
            goto L30
        L1f:
            r5 = 19
            if (r5 != r4) goto L2f
            com.google.android.material.datepicker.s r4 = r3.m3399a()
            int r4 = r4.m3433b()
            r3.setSelection(r4)
            return r2
        L2f:
            return r0
        L30:
            return r2
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.f6040b0
            if (r0 == 0) goto L1b
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            super.onMeasure(r2, r3)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r3 = r1.getMeasuredHeight()
            r2.height = r3
            goto L1e
        L1b:
            super.onMeasure(r2, r3)
        L1e:
            return
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(android.widget.ListAdapter r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.material.datepicker.C1174s
            if (r0 == 0) goto L8
            super.setAdapter(r4)
            return
        L8:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Class<com.google.android.material.datepicker.MaterialCalendarGridView> r2 = com.google.android.material.datepicker.MaterialCalendarGridView.class
            java.lang.String r2 = r2.getCanonicalName()
            r0[r1] = r2
            r1 = 1
            java.lang.Class<com.google.android.material.datepicker.s> r2 = com.google.android.material.datepicker.C1174s.class
            java.lang.String r2 = r2.getCanonicalName()
            r0[r1] = r2
            java.lang.String r1 = "%1$s must have its Adapter set to a %2$s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r4.<init>(r0)
            throw r4
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int r2) {
            r1 = this;
            com.google.android.material.datepicker.s r0 = r1.m3399a()
            int r0 = r0.m3433b()
            if (r2 >= r0) goto L12
            com.google.android.material.datepicker.s r2 = r1.m3399a()
            int r2 = r2.m3433b()
        L12:
            super.setSelection(r2)
            return
    }
}
