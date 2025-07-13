package com.google.android.exoplayer2.p044ui;

/* loaded from: classes.dex */
public class TrackSelectionView extends android.widget.LinearLayout {

    /* renamed from: a0 */
    public final android.widget.CheckedTextView f5302a0;

    /* renamed from: b0 */
    public final android.widget.CheckedTextView f5303b0;

    /* renamed from: c0 */
    public final android.util.SparseArray<p325s5.C5964d.f> f5304c0;

    /* renamed from: d0 */
    public boolean f5305d0;

    /* renamed from: e0 */
    public boolean f5306e0;

    /* renamed from: f0 */
    public p337t5.InterfaceC6179i f5307f0;

    /* renamed from: g0 */
    public p108g5.C2273i0 f5308g0;

    /* renamed from: h0 */
    public boolean f5309h0;

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$a */
    public static /* synthetic */ class C1050a {
    }

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    public class ViewOnClickListenerC1051b implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.exoplayer2.p044ui.TrackSelectionView f5310Y;

        public ViewOnClickListenerC1051b(com.google.android.exoplayer2.p044ui.TrackSelectionView r1, com.google.android.exoplayer2.p044ui.TrackSelectionView.C1050a r2) {
                r0 = this;
                r0.f5310Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.google.android.exoplayer2.ui.TrackSelectionView r0 = r3.f5310Y
                android.widget.CheckedTextView r1 = r0.f5302a0
                if (r4 != r1) goto Lf
                r4 = 1
                r0.f5309h0 = r4
                android.util.SparseArray<s5.d$f> r4 = r0.f5304c0
                r4.clear()
                goto L1b
            Lf:
                android.widget.CheckedTextView r1 = r0.f5303b0
                r2 = 0
                if (r4 != r1) goto L1f
                r0.f5309h0 = r2
                android.util.SparseArray<s5.d$f> r4 = r0.f5304c0
                r4.clear()
            L1b:
                r0.m2918a()
                return
            L1f:
                r0.f5309h0 = r2
                java.lang.Object r4 = r4.getTag()
                java.util.Objects.requireNonNull(r4)
                com.google.android.exoplayer2.ui.TrackSelectionView$c r4 = (com.google.android.exoplayer2.p044ui.TrackSelectionView.C1052c) r4
                int r4 = r4.f5311a
                android.util.SparseArray<s5.d$f> r0 = r0.f5304c0
                java.lang.Object r4 = r0.get(r4)
                s5.d$f r4 = (p325s5.C5964d.f) r4
                r4 = 0
                java.util.Objects.requireNonNull(r4)
                throw r4
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$c */
    public static final class C1052c {

        /* renamed from: a */
        public final int f5311a;
    }

    public TrackSelectionView(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r0 = 0
            r6.<init>(r7, r8, r0)
            r8 = 1
            r6.setOrientation(r8)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r6.f5304c0 = r1
            r6.setSaveFromParentEnabled(r0)
            android.content.res.Resources$Theme r1 = r7.getTheme()
            int[] r2 = new int[r8]
            r3 = 16843534(0x101030e, float:2.369575E-38)
            r2[r0] = r3
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2)
            int r2 = r1.getResourceId(r0, r0)
            r1.recycle()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            com.google.android.exoplayer2.ui.TrackSelectionView$b r1 = new com.google.android.exoplayer2.ui.TrackSelectionView$b
            r3 = 0
            r1.<init>(r6, r3)
            t5.b r3 = new t5.b
            android.content.res.Resources r4 = r6.getResources()
            r3.<init>(r4)
            r6.f5307f0 = r3
            g5.i0 r3 = p108g5.C2273i0.f10376b0
            r6.f5308g0 = r3
            r3 = 17367055(0x109000f, float:2.5162968E-38)
            android.view.View r4 = r7.inflate(r3, r6, r0)
            android.widget.CheckedTextView r4 = (android.widget.CheckedTextView) r4
            r6.f5302a0 = r4
            r4.setBackgroundResource(r2)
            r5 = 2131951807(0x7f1300bf, float:1.9540039E38)
            r4.setText(r5)
            r4.setEnabled(r0)
            r4.setFocusable(r8)
            r4.setOnClickListener(r1)
            r5 = 8
            r4.setVisibility(r5)
            r6.addView(r4)
            r4 = 2131558468(0x7f0d0044, float:1.8742253E38)
            android.view.View r4 = r7.inflate(r4, r6, r0)
            r6.addView(r4)
            android.view.View r7 = r7.inflate(r3, r6, r0)
            android.widget.CheckedTextView r7 = (android.widget.CheckedTextView) r7
            r6.f5303b0 = r7
            r7.setBackgroundResource(r2)
            r2 = 2131951806(0x7f1300be, float:1.9540037E38)
            r7.setText(r2)
            r7.setEnabled(r0)
            r7.setFocusable(r8)
            r7.setOnClickListener(r1)
            r6.addView(r7)
            return
    }

    /* renamed from: a */
    public final void m2918a() {
            r2 = this;
            android.widget.CheckedTextView r0 = r2.f5302a0
            boolean r1 = r2.f5309h0
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r2.f5303b0
            boolean r1 = r2.f5309h0
            if (r1 != 0) goto L17
            android.util.SparseArray<s5.d$f> r1 = r2.f5304c0
            int r1 = r1.size()
            if (r1 != 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            r0.setChecked(r1)
            r0 = 0
            throw r0
    }

    /* renamed from: b */
    public final void m2919b() {
            r2 = this;
            int r0 = r2.getChildCount()
        L4:
            int r0 = r0 + (-1)
            r1 = 3
            if (r0 < r1) goto Ld
            r2.removeViewAt(r0)
            goto L4
        Ld:
            android.widget.CheckedTextView r0 = r2.f5302a0
            r1 = 0
            r0.setEnabled(r1)
            android.widget.CheckedTextView r0 = r2.f5303b0
            r0.setEnabled(r1)
            return
    }

    public boolean getIsDisabled() {
            r1 = this;
            boolean r0 = r1.f5309h0
            return r0
    }

    public java.util.List<p325s5.C5964d.f> getOverrides() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            android.util.SparseArray<s5.d$f> r1 = r3.f5304c0
            int r1 = r1.size()
            r0.<init>(r1)
            r1 = 0
        Lc:
            android.util.SparseArray<s5.d$f> r2 = r3.f5304c0
            int r2 = r2.size()
            if (r1 >= r2) goto L22
            android.util.SparseArray<s5.d$f> r2 = r3.f5304c0
            java.lang.Object r2 = r2.valueAt(r1)
            s5.d$f r2 = (p325s5.C5964d.f) r2
            r0.add(r2)
            int r1 = r1 + 1
            goto Lc
        L22:
            return r0
    }

    public void setAllowAdaptiveSelections(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5305d0
            if (r0 == r2) goto L9
            r1.f5305d0 = r2
            r1.m2919b()
        L9:
            return
    }

    public void setAllowMultipleOverrides(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5306e0
            if (r0 == r2) goto L25
            r1.f5306e0 = r2
            if (r2 != 0) goto L22
            android.util.SparseArray<s5.d$f> r2 = r1.f5304c0
            int r2 = r2.size()
            r0 = 1
            if (r2 <= r0) goto L22
            android.util.SparseArray<s5.d$f> r2 = r1.f5304c0
            int r2 = r2.size()
            int r2 = r2 - r0
        L18:
            if (r2 <= 0) goto L22
            android.util.SparseArray<s5.d$f> r0 = r1.f5304c0
            r0.remove(r2)
            int r2 = r2 + (-1)
            goto L18
        L22:
            r1.m2919b()
        L25:
            return
    }

    public void setShowDisableOption(boolean r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.f5302a0
            if (r2 == 0) goto L6
            r2 = 0
            goto L8
        L6:
            r2 = 8
        L8:
            r0.setVisibility(r2)
            return
    }

    public void setTrackNameProvider(p337t5.InterfaceC6179i r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.f5307f0 = r1
            r0.m2919b()
            return
    }
}
