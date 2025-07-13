package p227n0;

/* renamed from: n0.a */
/* loaded from: classes.dex */
public class C4641a {

    /* renamed from: c */
    public static final android.view.View.AccessibilityDelegate f18501c = null;

    /* renamed from: a */
    public final android.view.View.AccessibilityDelegate f18502a;

    /* renamed from: b */
    public final android.view.View.AccessibilityDelegate f18503b;

    /* renamed from: n0.a$a */
    public static final class a extends android.view.View.AccessibilityDelegate {

        /* renamed from: a */
        public final p227n0.C4641a f18504a;

        public a(p227n0.C4641a r1) {
                r0 = this;
                r0.<init>()
                r0.f18504a = r1
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                n0.a r0 = r1.f18504a
                boolean r2 = r0.mo2063a(r2, r3)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r2) {
                r1 = this;
                n0.a r0 = r1.f18504a
                o0.c r2 = r0.mo2064b(r2)
                if (r2 == 0) goto Ld
                java.lang.Object r2 = r2.f19354a
                android.view.accessibility.AccessibilityNodeProvider r2 = (android.view.accessibility.AccessibilityNodeProvider) r2
                goto Le
            Ld:
                r2 = 0
            Le:
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                n0.a r0 = r1.f18504a
                r0.mo1039c(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(android.view.View r18, android.view.accessibility.AccessibilityNodeInfo r19) {
                r17 = this;
                r0 = r18
                r1 = r19
                java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
                o0.b r3 = new o0.b
                r3.<init>(r1)
                java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
                int r4 = android.os.Build.VERSION.SDK_INT
                r6 = 1
                r7 = 28
                if (r4 < r7) goto L16
                r8 = 1
                goto L17
            L16:
                r8 = 0
            L17:
                r9 = 0
                if (r8 == 0) goto L23
                boolean r8 = p227n0.C4661t.l.m10650d(r18)
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                goto L32
            L23:
                r8 = 2131362660(0x7f0a0364, float:1.8345107E38)
                java.lang.Object r8 = r0.getTag(r8)
                boolean r10 = r2.isInstance(r8)
                if (r10 == 0) goto L31
                goto L32
            L31:
                r8 = r9
            L32:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                if (r8 == 0) goto L3e
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L3e
                r8 = 1
                goto L3f
            L3e:
                r8 = 0
            L3f:
                if (r4 < r7) goto L45
                r1.setScreenReaderFocusable(r8)
                goto L48
            L45:
                r3.m10995h(r6, r8)
            L48:
                r8 = 2131362655(0x7f0a035f, float:1.8345097E38)
                if (r4 < r7) goto L4f
                r10 = 1
                goto L50
            L4f:
                r10 = 0
            L50:
                if (r10 == 0) goto L5b
                boolean r2 = p227n0.C4661t.l.m10649c(r18)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                goto L68
            L5b:
                java.lang.Object r8 = r0.getTag(r8)
                boolean r2 = r2.isInstance(r8)
                if (r2 == 0) goto L67
                r2 = r8
                goto L68
            L67:
                r2 = r9
            L68:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                if (r2 == 0) goto L74
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L74
                r2 = 1
                goto L75
            L74:
                r2 = 0
            L75:
                if (r4 < r7) goto L7b
                r1.setHeading(r2)
                goto L7f
            L7b:
                r8 = 2
                r3.m10995h(r8, r2)
            L7f:
                java.lang.CharSequence r2 = p227n0.C4661t.m10533i(r18)
                if (r4 < r7) goto L89
                r1.setPaneTitle(r2)
                goto L92
            L89:
                android.os.Bundle r7 = r19.getExtras()
                java.lang.String r8 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
                r7.putCharSequence(r8, r2)
            L92:
                java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
                r7 = 2131362661(0x7f0a0365, float:1.8345109E38)
                r8 = 30
                if (r4 < r8) goto L9d
                r10 = 1
                goto L9e
            L9d:
                r10 = 0
            L9e:
                if (r10 == 0) goto La5
                java.lang.CharSequence r9 = p227n0.C4661t.n.m10660a(r18)
                goto Lb0
            La5:
                java.lang.Object r7 = r0.getTag(r7)
                boolean r2 = r2.isInstance(r7)
                if (r2 == 0) goto Lb0
                r9 = r7
            Lb0:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                if (r4 < r8) goto Lb5
                goto Lb6
            Lb5:
                r6 = 0
            Lb6:
                if (r6 == 0) goto Lbc
                r1.setStateDescription(r9)
                goto Lc5
            Lbc:
                android.os.Bundle r2 = r19.getExtras()
                java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
                r2.putCharSequence(r6, r9)
            Lc5:
                r2 = r17
                n0.a r6 = r2.f18504a
                r6.mo1040d(r0, r3)
                java.lang.CharSequence r6 = r19.getText()
                r7 = 26
                if (r4 >= r7) goto L1d8
                android.os.Bundle r4 = r19.getExtras()
                java.lang.String r7 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
                r4.remove(r7)
                android.os.Bundle r4 = r19.getExtras()
                java.lang.String r8 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
                r4.remove(r8)
                android.os.Bundle r4 = r19.getExtras()
                java.lang.String r9 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
                r4.remove(r9)
                android.os.Bundle r1 = r19.getExtras()
                java.lang.String r4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
                r1.remove(r4)
                r1 = 2131362654(0x7f0a035e, float:1.8345095E38)
                java.lang.Object r10 = r0.getTag(r1)
                android.util.SparseArray r10 = (android.util.SparseArray) r10
                if (r10 == 0) goto L13c
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                r12 = 0
            L109:
                int r13 = r10.size()
                if (r12 >= r13) goto L125
                java.lang.Object r13 = r10.valueAt(r12)
                java.lang.ref.WeakReference r13 = (java.lang.ref.WeakReference) r13
                java.lang.Object r13 = r13.get()
                if (r13 != 0) goto L122
                java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
                r11.add(r13)
            L122:
                int r12 = r12 + 1
                goto L109
            L125:
                r12 = 0
            L126:
                int r13 = r11.size()
                if (r12 >= r13) goto L13c
                java.lang.Object r13 = r11.get(r12)
                java.lang.Integer r13 = (java.lang.Integer) r13
                int r13 = r13.intValue()
                r10.remove(r13)
                int r12 = r12 + 1
                goto L126
            L13c:
                android.text.style.ClickableSpan[] r10 = p242o0.C4868b.m10989d(r6)
                if (r10 == 0) goto L1d8
                int r11 = r10.length
                if (r11 <= 0) goto L1d8
                android.os.Bundle r11 = r3.m10993f()
                r12 = 2131361812(0x7f0a0014, float:1.8343387E38)
                java.lang.String r13 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"
                r11.putInt(r13, r12)
                java.lang.Object r11 = r0.getTag(r1)
                android.util.SparseArray r11 = (android.util.SparseArray) r11
                if (r11 != 0) goto L161
                android.util.SparseArray r11 = new android.util.SparseArray
                r11.<init>()
                r0.setTag(r1, r11)
            L161:
                r1 = 0
            L162:
                int r12 = r10.length
                if (r1 >= r12) goto L1d8
                r12 = r10[r1]
                r13 = 0
            L168:
                int r14 = r11.size()
                if (r13 >= r14) goto L188
                java.lang.Object r14 = r11.valueAt(r13)
                java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
                java.lang.Object r14 = r14.get()
                android.text.style.ClickableSpan r14 = (android.text.style.ClickableSpan) r14
                boolean r14 = r12.equals(r14)
                if (r14 == 0) goto L185
                int r12 = r11.keyAt(r13)
                goto L18e
            L185:
                int r13 = r13 + 1
                goto L168
            L188:
                int r12 = p242o0.C4868b.f19336d
                int r13 = r12 + 1
                p242o0.C4868b.f19336d = r13
            L18e:
                java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
                r14 = r10[r1]
                r13.<init>(r14)
                r11.put(r12, r13)
                r13 = r10[r1]
                r14 = r6
                android.text.Spanned r14 = (android.text.Spanned) r14
                java.util.List r15 = r3.m10991b(r7)
                int r16 = r14.getSpanStart(r13)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
                r15.add(r5)
                java.util.List r5 = r3.m10991b(r8)
                int r15 = r14.getSpanEnd(r13)
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r5.add(r15)
                java.util.List r5 = r3.m10991b(r9)
                int r13 = r14.getSpanFlags(r13)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r5.add(r13)
                java.util.List r5 = r3.m10991b(r4)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r5.add(r12)
                int r1 = r1 + 1
                goto L162
            L1d8:
                r1 = 2131362653(0x7f0a035d, float:1.8345093E38)
                java.lang.Object r0 = r0.getTag(r1)
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L1e7
                java.util.List r0 = java.util.Collections.emptyList()
            L1e7:
                r5 = 0
            L1e8:
                int r1 = r0.size()
                if (r5 >= r1) goto L1fa
                java.lang.Object r1 = r0.get(r5)
                o0.b$a r1 = (p242o0.C4868b.a) r1
                r3.m10990a(r1)
                int r5 = r5 + 1
                goto L1e8
            L1fa:
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                n0.a r0 = r1.f18504a
                r0.mo2065e(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                n0.a r0 = r1.f18504a
                boolean r2 = r0.mo2066f(r2, r3, r4)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(android.view.View r2, int r3, android.os.Bundle r4) {
                r1 = this;
                n0.a r0 = r1.f18504a
                boolean r2 = r0.mo1041g(r2, r3, r4)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(android.view.View r2, int r3) {
                r1 = this;
                n0.a r0 = r1.f18504a
                r0.mo2067h(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                n0.a r0 = r1.f18504a
                r0.mo2068i(r2, r3)
                return
        }
    }

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            p227n0.C4641a.f18501c = r0
            return
    }

    public C4641a() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = p227n0.C4641a.f18501c
            r1.<init>()
            r1.f18502a = r0
            n0.a$a r0 = new n0.a$a
            r0.<init>(r1)
            r1.f18503b = r0
            return
    }

    public C4641a(android.view.View.AccessibilityDelegate r1) {
            r0 = this;
            r0.<init>()
            r0.f18502a = r1
            n0.a$a r1 = new n0.a$a
            r1.<init>(r0)
            r0.f18503b = r1
            return
    }

    /* renamed from: a */
    public boolean mo2063a(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f18502a
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
            return r2
    }

    /* renamed from: b */
    public p242o0.C4869c mo2064b(android.view.View r2) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f18502a
            android.view.accessibility.AccessibilityNodeProvider r2 = r0.getAccessibilityNodeProvider(r2)
            if (r2 == 0) goto Le
            o0.c r0 = new o0.c
            r0.<init>(r2)
            return r0
        Le:
            r2 = 0
            return r2
    }

    /* renamed from: c */
    public void mo1039c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f18502a
            r0.onInitializeAccessibilityEvent(r2, r3)
            return
    }

    /* renamed from: d */
    public void mo1040d(android.view.View r2, p242o0.C4868b r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f18502a
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.f19337a
            r0.onInitializeAccessibilityNodeInfo(r2, r3)
            return
    }

    /* renamed from: e */
    public void mo2065e(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f18502a
            r0.onPopulateAccessibilityEvent(r2, r3)
            return
    }

    /* renamed from: f */
    public boolean mo2066f(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f18502a
            boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r2
    }

    /* renamed from: g */
    public boolean mo1041g(android.view.View r9, int r10, android.os.Bundle r11) {
            r8 = this;
            r0 = 2131362653(0x7f0a035d, float:1.8345093E38)
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lf
            java.util.List r0 = java.util.Collections.emptyList()
        Lf:
            r1 = 0
            r2 = 0
        L11:
            int r3 = r0.size()
            if (r2 >= r3) goto L70
            java.lang.Object r3 = r0.get(r2)
            o0.b$a r3 = (p242o0.C4868b.a) r3
            int r4 = r3.m10999a()
            if (r4 != r10) goto L6d
            o0.d r0 = r3.f19351d
            if (r0 == 0) goto L70
            r0 = 0
            java.lang.Class<? extends o0.d$a> r2 = r3.f19350c
            if (r2 == 0) goto L66
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L40
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L40
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L40
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.Exception -> L40
            o0.d$a r2 = (p242o0.InterfaceC4870d.a) r2     // Catch: java.lang.Exception -> L40
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L3e
            goto L65
        L3e:
            r0 = move-exception
            goto L44
        L40:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L44:
            java.lang.Class<? extends o0.d$a> r4 = r3.f19350c
            if (r4 != 0) goto L4b
            java.lang.String r4 = "null"
            goto L4f
        L4b:
            java.lang.String r4 = r4.getName()
        L4f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r0)
        L65:
            r0 = r2
        L66:
            o0.d r2 = r3.f19351d
            boolean r0 = r2.mo36a(r9, r0)
            goto L71
        L6d:
            int r2 = r2 + 1
            goto L11
        L70:
            r0 = 0
        L71:
            if (r0 != 0) goto L79
            android.view.View$AccessibilityDelegate r0 = r8.f18502a
            boolean r0 = r0.performAccessibilityAction(r9, r10, r11)
        L79:
            if (r0 != 0) goto Lca
            r2 = 2131361812(0x7f0a0014, float:1.8343387E38)
            if (r10 != r2) goto Lca
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            r11 = 2131362654(0x7f0a035e, float:1.8345095E38)
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto Lc9
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto Lc9
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto Lc2
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = p242o0.C4868b.m10989d(r11)
            r2 = 0
        Lb0:
            if (r11 == 0) goto Lc2
            int r3 = r11.length
            if (r2 >= r3) goto Lc2
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto Lbf
            r11 = 1
            goto Lc3
        Lbf:
            int r2 = r2 + 1
            goto Lb0
        Lc2:
            r11 = 0
        Lc3:
            if (r11 == 0) goto Lc9
            r10.onClick(r9)
            r1 = 1
        Lc9:
            r0 = r1
        Lca:
            return r0
    }

    /* renamed from: h */
    public void mo2067h(android.view.View r2, int r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f18502a
            r0.sendAccessibilityEvent(r2, r3)
            return
    }

    /* renamed from: i */
    public void mo2068i(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f18502a
            r0.sendAccessibilityEventUnchecked(r2, r3)
            return
    }
}
