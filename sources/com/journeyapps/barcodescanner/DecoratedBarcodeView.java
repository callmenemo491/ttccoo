package com.journeyapps.barcodescanner;

/* loaded from: classes.dex */
public class DecoratedBarcodeView extends android.widget.FrameLayout {

    /* renamed from: a0 */
    public com.journeyapps.barcodescanner.BarcodeView f6665a0;

    /* renamed from: b0 */
    public com.journeyapps.barcodescanner.ViewfinderView f6666b0;

    /* renamed from: c0 */
    public android.widget.TextView f6667c0;

    /* renamed from: d0 */
    public com.journeyapps.barcodescanner.DecoratedBarcodeView.InterfaceC1250a f6668d0;

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$a */
    public interface InterfaceC1250a {
        /* renamed from: a */
        void m3689a();

        /* renamed from: b */
        void m3690b();
    }

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$b */
    public class C1251b implements p454zc.InterfaceC7278b {

        /* renamed from: Y */
        public p454zc.InterfaceC7278b f6669Y;

        /* renamed from: Z */
        public final /* synthetic */ com.journeyapps.barcodescanner.DecoratedBarcodeView f6670Z;

        public C1251b(com.journeyapps.barcodescanner.DecoratedBarcodeView r1, p454zc.InterfaceC7278b r2) {
                r0 = this;
                r0.f6670Z = r1
                r0.<init>()
                r0.f6669Y = r2
                return
        }

        @Override // p454zc.InterfaceC7278b
        /* renamed from: a */
        public void mo2673a(p454zc.C7279c r2) {
                r1 = this;
                zc.b r0 = r1.f6669Y
                r0.mo2673a(r2)
                return
        }

        @Override // p454zc.InterfaceC7278b
        /* renamed from: b */
        public void mo2674b(java.util.List<sb.C6023q> r6) {
                r5 = this;
                java.util.Iterator r0 = r6.iterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                sb.q r1 = (sb.C6023q) r1
                com.journeyapps.barcodescanner.DecoratedBarcodeView r2 = r5.f6670Z
                com.journeyapps.barcodescanner.ViewfinderView r2 = r2.f6666b0
                java.util.List<sb.q> r3 = r2.f6678g0
                int r3 = r3.size()
                r4 = 20
                if (r3 >= r4) goto L4
                java.util.List<sb.q> r2 = r2.f6678g0
                r2.add(r1)
                goto L4
            L24:
                zc.b r0 = r5.f6669Y
                r0.mo2674b(r6)
                return
        }
    }

    public DecoratedBarcodeView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            android.content.Context r3 = r2.getContext()
            int[] r0 = p413xb.C7025h.f27357c
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            r0 = 0
            r1 = 2131558694(0x7f0d0126, float:1.8742711E38)
            int r0 = r3.getResourceId(r0, r1)
            r3.recycle()
            android.content.Context r3 = r2.getContext()
            android.widget.FrameLayout.inflate(r3, r0, r2)
            r3 = 2131362783(0x7f0a03df, float:1.8345356E38)
            android.view.View r3 = r2.findViewById(r3)
            com.journeyapps.barcodescanner.BarcodeView r3 = (com.journeyapps.barcodescanner.BarcodeView) r3
            r2.f6665a0 = r3
            if (r3 == 0) goto L55
            r3.m3698b(r4)
            r3 = 2131362793(0x7f0a03e9, float:1.8345377E38)
            android.view.View r3 = r2.findViewById(r3)
            com.journeyapps.barcodescanner.ViewfinderView r3 = (com.journeyapps.barcodescanner.ViewfinderView) r3
            r2.f6666b0 = r3
            if (r3 == 0) goto L4d
            com.journeyapps.barcodescanner.BarcodeView r4 = r2.f6665a0
            r3.setCameraPreview(r4)
            r3 = 2131362792(0x7f0a03e8, float:1.8345375E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f6667c0 = r3
            return
        L4d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\"."
            r3.<init>(r4)
            throw r3
        L55:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\"."
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: a */
    public void m3688a(android.content.Intent r13) {
            r12 = this;
            java.util.regex.Pattern r0 = p413xb.C7022e.f27345a
            java.lang.String r0 = "SCAN_FORMATS"
            java.lang.String r0 = r13.getStringExtra(r0)
            r1 = 0
            if (r0 == 0) goto L16
            java.util.regex.Pattern r2 = p413xb.C7022e.f27345a
            java.lang.String[] r0 = r2.split(r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            goto L17
        L16:
            r0 = r1
        L17:
            java.lang.String r2 = "SCAN_MODE"
            java.lang.String r2 = r13.getStringExtra(r2)
            if (r0 == 0) goto L3e
            java.lang.Class<sb.a> r3 = sb.EnumC6007a.class
            java.util.EnumSet r3 = java.util.EnumSet.noneOf(r3)
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.IllegalArgumentException -> L3d
        L29:
            boolean r4 = r0.hasNext()     // Catch: java.lang.IllegalArgumentException -> L3d
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r0.next()     // Catch: java.lang.IllegalArgumentException -> L3d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.IllegalArgumentException -> L3d
            sb.a r4 = sb.EnumC6007a.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> L3d
            r3.add(r4)     // Catch: java.lang.IllegalArgumentException -> L3d
            goto L29
        L3d:
        L3e:
            if (r2 == 0) goto L4c
            java.util.Map<java.lang.String, java.util.Set<sb.a>> r0 = p413xb.C7022e.f27346b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r2)
            r3 = r0
            java.util.Set r3 = (java.util.Set) r3
            goto L4d
        L4c:
            r3 = r1
        L4d:
            int r0 = p413xb.C7023f.f27347a
            java.lang.String r0 = "f"
            android.os.Bundle r2 = r13.getExtras()
            r4 = 0
            if (r2 == 0) goto Ld8
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L60
            goto Ld8
        L60:
            java.util.EnumMap r1 = new java.util.EnumMap
            java.lang.Class<sb.c> r5 = sb.EnumC6009c.class
            r1.<init>(r5)
            sb.c[] r5 = sb.EnumC6009c.values()
            int r6 = r5.length
            r7 = 0
        L6d:
            if (r7 >= r6) goto Lc4
            r8 = r5[r7]
            sb.c r9 = sb.EnumC6009c.f23173c0
            if (r8 == r9) goto Lc1
            sb.c r9 = sb.EnumC6009c.f23178h0
            if (r8 == r9) goto Lc1
            sb.c r9 = sb.EnumC6009c.f23171a0
            if (r8 != r9) goto L7e
            goto Lc1
        L7e:
            java.lang.String r9 = r8.name()
            boolean r10 = r2.containsKey(r9)
            if (r10 == 0) goto Lc1
            java.lang.Class<?> r10 = r8.f23181Y
            java.lang.Class<java.lang.Void> r11 = java.lang.Void.class
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L95
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            goto La1
        L95:
            java.lang.Object r9 = r2.get(r9)
            java.lang.Class<?> r10 = r8.f23181Y
            boolean r10 = r10.isInstance(r9)
            if (r10 == 0) goto La5
        La1:
            r1.put(r8, r9)
            goto Lc1
        La5:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Ignoring hint "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = " because it is not assignable from "
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            android.util.Log.w(r0, r8)
        Lc1:
            int r7 = r7 + 1
            goto L6d
        Lc4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Hints from the Intent: "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r0, r2)
        Ld8:
            ad.f r0 = new ad.f
            r0.<init>()
            java.lang.String r2 = "SCAN_CAMERA_ID"
            boolean r5 = r13.hasExtra(r2)
            if (r5 == 0) goto Lee
            r5 = -1
            int r2 = r13.getIntExtra(r2, r5)
            if (r2 < 0) goto Lee
            r0.f196a = r2
        Lee:
            java.lang.String r2 = "TORCH_ENABLED"
            boolean r5 = r13.hasExtra(r2)
            if (r5 == 0) goto L109
            boolean r2 = r13.getBooleanExtra(r2, r4)
            if (r2 == 0) goto L109
            com.journeyapps.barcodescanner.BarcodeView r2 = r12.f6665a0
            r5 = 1
            r2.setTorch(r5)
            com.journeyapps.barcodescanner.DecoratedBarcodeView$a r2 = r12.f6668d0
            if (r2 == 0) goto L109
            r2.m3690b()
        L109:
            java.lang.String r2 = "PROMPT_MESSAGE"
            java.lang.String r2 = r13.getStringExtra(r2)
            if (r2 == 0) goto L114
            r12.setStatusText(r2)
        L114:
            java.lang.String r2 = "SCAN_TYPE"
            int r2 = r13.getIntExtra(r2, r4)
            java.lang.String r4 = "CHARACTER_SET"
            java.lang.String r13 = r13.getStringExtra(r4)
            sb.i r4 = new sb.i
            r4.<init>()
            r4.m12498e(r1)
            com.journeyapps.barcodescanner.BarcodeView r4 = r12.f6665a0
            r4.setCameraSettings(r0)
            com.journeyapps.barcodescanner.BarcodeView r0 = r12.f6665a0
            zc.l r4 = new zc.l
            r4.<init>(r3, r1, r13, r2)
            r0.setDecoderFactory(r4)
            return
    }

    public com.journeyapps.barcodescanner.BarcodeView getBarcodeView() {
            r1 = this;
            r0 = 2131362783(0x7f0a03df, float:1.8345356E38)
            android.view.View r0 = r1.findViewById(r0)
            com.journeyapps.barcodescanner.BarcodeView r0 = (com.journeyapps.barcodescanner.BarcodeView) r0
            return r0
    }

    public ad.C0063f getCameraSettings() {
            r1 = this;
            com.journeyapps.barcodescanner.BarcodeView r0 = r1.f6665a0
            ad.f r0 = r0.getCameraSettings()
            return r0
    }

    public p454zc.InterfaceC7285i getDecoderFactory() {
            r1 = this;
            com.journeyapps.barcodescanner.BarcodeView r0 = r1.f6665a0
            zc.i r0 = r0.getDecoderFactory()
            return r0
    }

    public android.widget.TextView getStatusView() {
            r1 = this;
            android.widget.TextView r0 = r1.f6667c0
            return r0
    }

    public com.journeyapps.barcodescanner.ViewfinderView getViewFinder() {
            r1 = this;
            com.journeyapps.barcodescanner.ViewfinderView r0 = r1.f6666b0
            return r0
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r3, android.view.KeyEvent r4) {
            r2 = this;
            r0 = 24
            r1 = 1
            if (r3 == r0) goto L25
            r0 = 25
            if (r3 == r0) goto L17
            r0 = 27
            if (r3 == r0) goto L16
            r0 = 80
            if (r3 == r0) goto L16
            boolean r3 = super.onKeyDown(r3, r4)
            return r3
        L16:
            return r1
        L17:
            com.journeyapps.barcodescanner.BarcodeView r3 = r2.f6665a0
            r4 = 0
            r3.setTorch(r4)
            com.journeyapps.barcodescanner.DecoratedBarcodeView$a r3 = r2.f6668d0
            if (r3 == 0) goto L24
            r3.m3689a()
        L24:
            return r1
        L25:
            com.journeyapps.barcodescanner.BarcodeView r3 = r2.f6665a0
            r3.setTorch(r1)
            com.journeyapps.barcodescanner.DecoratedBarcodeView$a r3 = r2.f6668d0
            if (r3 == 0) goto L31
            r3.m3690b()
        L31:
            return r1
    }

    public void setCameraSettings(ad.C0063f r2) {
            r1 = this;
            com.journeyapps.barcodescanner.BarcodeView r0 = r1.f6665a0
            r0.setCameraSettings(r2)
            return
    }

    public void setDecoderFactory(p454zc.InterfaceC7285i r2) {
            r1 = this;
            com.journeyapps.barcodescanner.BarcodeView r0 = r1.f6665a0
            r0.setDecoderFactory(r2)
            return
    }

    public void setStatusText(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f6667c0
            if (r0 == 0) goto L7
            r0.setText(r2)
        L7:
            return
    }

    public void setTorchListener(com.journeyapps.barcodescanner.DecoratedBarcodeView.InterfaceC1250a r1) {
            r0 = this;
            r0.f6668d0 = r1
            return
    }
}
