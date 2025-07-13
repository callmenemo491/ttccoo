package p280q0;

/* renamed from: q0.g */
/* loaded from: classes.dex */
public final class C5540g {

    /* renamed from: q0.g$a */
    public static class a implements android.view.ActionMode.Callback {

        /* renamed from: a */
        public final android.view.ActionMode.Callback f21576a;

        /* renamed from: b */
        public final android.widget.TextView f21577b;

        /* renamed from: c */
        public java.lang.Class<?> f21578c;

        /* renamed from: d */
        public java.lang.reflect.Method f21579d;

        /* renamed from: e */
        public boolean f21580e;

        /* renamed from: f */
        public boolean f21581f;

        public a(android.view.ActionMode.Callback r1, android.widget.TextView r2) {
                r0 = this;
                r0.<init>()
                r0.f21576a = r1
                r0.f21577b = r2
                r1 = 0
                r0.f21581f = r1
                return
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(android.view.ActionMode r2, android.view.MenuItem r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f21576a
                boolean r2 = r0.onActionItemClicked(r2, r3)
                return r2
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(android.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f21576a
                boolean r2 = r0.onCreateActionMode(r2, r3)
                return r2
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(android.view.ActionMode r2) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f21576a
                r0.onDestroyActionMode(r2)
                return
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
                r12 = this;
                android.widget.TextView r0 = r12.f21577b
                android.content.Context r0 = r0.getContext()
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                boolean r2 = r12.f21581f
                java.lang.String r3 = "removeItemAt"
                r4 = 1
                r5 = 0
                if (r2 != 0) goto L32
                r12.f21581f = r4
                java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L2b
                r12.f21578c = r2     // Catch: java.lang.Throwable -> L2b
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L2b
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L2b
                r6[r5] = r7     // Catch: java.lang.Throwable -> L2b
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch: java.lang.Throwable -> L2b
                r12.f21579d = r2     // Catch: java.lang.Throwable -> L2b
                r12.f21580e = r4     // Catch: java.lang.Throwable -> L2b
                goto L32
            L2b:
                r2 = 0
                r12.f21578c = r2
                r12.f21579d = r2
                r12.f21580e = r5
            L32:
                boolean r2 = r12.f21580e     // Catch: java.lang.Throwable -> L129
                if (r2 == 0) goto L41
                java.lang.Class<?> r2 = r12.f21578c     // Catch: java.lang.Throwable -> L129
                boolean r2 = r2.isInstance(r14)     // Catch: java.lang.Throwable -> L129
                if (r2 == 0) goto L41
                java.lang.reflect.Method r2 = r12.f21579d     // Catch: java.lang.Throwable -> L129
                goto L4f
            L41:
                java.lang.Class r2 = r14.getClass()     // Catch: java.lang.Throwable -> L129
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L129
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L129
                r6[r5] = r7     // Catch: java.lang.Throwable -> L129
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch: java.lang.Throwable -> L129
            L4f:
                int r3 = r14.size()     // Catch: java.lang.Throwable -> L129
                int r3 = r3 - r4
            L54:
                java.lang.String r6 = "android.intent.action.PROCESS_TEXT"
                if (r3 < 0) goto L7e
                android.view.MenuItem r7 = r14.getItem(r3)     // Catch: java.lang.Throwable -> L129 java.lang.Throwable -> L129 java.lang.Throwable -> L129
                android.content.Intent r8 = r7.getIntent()     // Catch: java.lang.Throwable -> L129 java.lang.Throwable -> L129 java.lang.Throwable -> L129
                if (r8 == 0) goto L7b
                android.content.Intent r7 = r7.getIntent()     // Catch: java.lang.Throwable -> L129 java.lang.Throwable -> L129 java.lang.Throwable -> L129
                java.lang.String r7 = r7.getAction()     // Catch: java.lang.Throwable -> L129 java.lang.Throwable -> L129 java.lang.Throwable -> L129
                boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L129 java.lang.Throwable -> L129 java.lang.Throwable -> L129
                if (r6 == 0) goto L7b
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L129 java.lang.Throwable -> L129 java.lang.Throwable -> L129
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L129 java.lang.Throwable -> L129 java.lang.Throwable -> L129
                r6[r5] = r7     // Catch: java.lang.Throwable -> L129 java.lang.Throwable -> L129 java.lang.Throwable -> L129
                r2.invoke(r14, r6)     // Catch: java.lang.Throwable -> L129 java.lang.Throwable -> L129 java.lang.Throwable -> L129
            L7b:
                int r3 = r3 + (-1)
                goto L54
            L7e:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                boolean r3 = r0 instanceof android.app.Activity
                java.lang.String r7 = "text/plain"
                if (r3 != 0) goto L8a
                goto Ld5
            L8a:
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                android.content.Intent r3 = r3.setAction(r6)
                android.content.Intent r3 = r3.setType(r7)
                java.util.List r3 = r1.queryIntentActivities(r3, r5)
                java.util.Iterator r3 = r3.iterator()
            L9f:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto Ld5
                java.lang.Object r8 = r3.next()
                android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
                java.lang.String r9 = r0.getPackageName()
                android.content.pm.ActivityInfo r10 = r8.activityInfo
                java.lang.String r10 = r10.packageName
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto Lba
                goto Lce
            Lba:
                android.content.pm.ActivityInfo r9 = r8.activityInfo
                boolean r10 = r9.exported
                if (r10 != 0) goto Lc1
                goto Lcc
            Lc1:
                java.lang.String r9 = r9.permission
                if (r9 == 0) goto Lce
                int r9 = r0.checkSelfPermission(r9)
                if (r9 != 0) goto Lcc
                goto Lce
            Lcc:
                r9 = 0
                goto Lcf
            Lce:
                r9 = 1
            Lcf:
                if (r9 == 0) goto L9f
                r2.add(r8)
                goto L9f
            Ld5:
                r0 = 0
            Ld6:
                int r3 = r2.size()
                if (r0 >= r3) goto L129
                java.lang.Object r3 = r2.get(r0)
                android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
                int r8 = r0 + 100
                java.lang.CharSequence r9 = r3.loadLabel(r1)
                android.view.MenuItem r8 = r14.add(r5, r5, r8, r9)
                android.widget.TextView r9 = r12.f21577b
                android.content.Intent r10 = new android.content.Intent
                r10.<init>()
                android.content.Intent r10 = r10.setAction(r6)
                android.content.Intent r10 = r10.setType(r7)
                boolean r11 = r9 instanceof android.text.Editable
                if (r11 == 0) goto L10d
                boolean r11 = r9.onCheckIsTextEditor()
                if (r11 == 0) goto L10d
                boolean r9 = r9.isEnabled()
                if (r9 == 0) goto L10d
                r9 = 1
                goto L10e
            L10d:
                r9 = 0
            L10e:
                r9 = r9 ^ r4
                java.lang.String r11 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r9 = r10.putExtra(r11, r9)
                android.content.pm.ActivityInfo r3 = r3.activityInfo
                java.lang.String r10 = r3.packageName
                java.lang.String r3 = r3.name
                android.content.Intent r3 = r9.setClassName(r10, r3)
                android.view.MenuItem r3 = r8.setIntent(r3)
                r3.setShowAsAction(r4)
                int r0 = r0 + 1
                goto Ld6
            L129:
                android.view.ActionMode$Callback r0 = r12.f21576a
                boolean r13 = r0.onPrepareActionMode(r13, r14)
                return r13
        }
    }

    /* renamed from: a */
    public static p195l0.C4158b.a m11817a(android.widget.TextView r9) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            l0.b$a r0 = new l0.b$a
            android.text.PrecomputedText$Params r9 = r9.getTextMetricsParams()
            r0.<init>(r9)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r9.getPaint()
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 23
            r6 = 1
            if (r3 < r5) goto L24
            r3 = 1
            r7 = 1
            goto L26
        L24:
            r3 = 0
            r7 = 0
        L26:
            android.text.TextDirectionHeuristic r8 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r0 < r5) goto L32
            int r3 = r9.getBreakStrategy()
            int r7 = r9.getHyphenationFrequency()
        L32:
            android.text.method.TransformationMethod r5 = r9.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L3d
        L3a:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.LTR
            goto L82
        L3d:
            if (r0 < r1) goto L64
            int r0 = r9.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L64
            java.util.Locale r9 = r9.getTextLocale()
            android.icu.text.DecimalFormatSymbols r9 = android.icu.text.DecimalFormatSymbols.getInstance(r9)
            java.lang.String[] r9 = r9.getDigitStrings()
            r9 = r9[r4]
            int r9 = r9.codePointAt(r4)
            byte r9 = java.lang.Character.getDirectionality(r9)
            if (r9 == r6) goto L7a
            r0 = 2
            if (r9 != r0) goto L3a
            goto L7a
        L64:
            int r0 = r9.getLayoutDirection()
            if (r0 != r6) goto L6b
            r4 = 1
        L6b:
            int r9 = r9.getTextDirection()
            switch(r9) {
                case 2: goto L7d;
                case 3: goto L3a;
                case 4: goto L7a;
                case 5: goto L77;
                case 6: goto L80;
                case 7: goto L74;
                default: goto L72;
            }
        L72:
            if (r4 == 0) goto L80
        L74:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L82
        L77:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.LOCALE
            goto L82
        L7a:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.RTL
            goto L82
        L7d:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L82
        L80:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L82:
            l0.b$a r0 = new l0.b$a
            r0.<init>(r2, r9, r3, r7)
            return r0
    }

    /* renamed from: b */
    public static void m11818b(android.widget.TextView r3, int r4) {
            p064e.C1487a.m4026d(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            r3.setFirstBaselineToTopHeight(r4)
            return
        Ld:
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r3.getIncludeFontPadding()
            if (r1 == 0) goto L1e
            int r0 = r0.top
            goto L20
        L1e:
            int r0 = r0.ascent
        L20:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L36
            int r4 = r4 + r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r2 = r3.getPaddingBottom()
            r3.setPadding(r0, r4, r1, r2)
        L36:
            return
    }

    /* renamed from: c */
    public static void m11819c(android.widget.TextView r3, int r4) {
            p064e.C1487a.m4026d(r4)
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r3.getIncludeFontPadding()
            if (r1 == 0) goto L14
            int r0 = r0.bottom
            goto L16
        L14:
            int r0 = r0.descent
        L16:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L2c
            int r4 = r4 - r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingRight()
            r3.setPadding(r0, r1, r2, r4)
        L2c:
            return
    }

    /* renamed from: d */
    public static void m11820d(android.widget.TextView r2, int r3) {
            p064e.C1487a.m4026d(r3)
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r3 == r0) goto L15
            int r3 = r3 - r0
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r0)
        L15:
            return
    }

    /* renamed from: e */
    public static void m11821e(android.widget.TextView r3, p195l0.C4158b r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 < r2) goto Le
            java.util.Objects.requireNonNull(r4)
            r3.setText(r1)
            goto L1e
        Le:
            l0.b$a r0 = m11817a(r3)
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r0.m9218a(r1)
            if (r0 == 0) goto L1f
            r3.setText(r4)
        L1e:
            return
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Given text can not be applied to TextView."
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: f */
    public static void m11822f(android.widget.TextView r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            r2.setTextAppearance(r3)
            goto L11
        La:
            android.content.Context r0 = r2.getContext()
            r2.setTextAppearance(r0, r3)
        L11:
            return
    }

    /* renamed from: g */
    public static android.view.ActionMode.Callback m11823g(android.widget.TextView r2, android.view.ActionMode.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            r1 = 27
            if (r0 > r1) goto L17
            boolean r0 = r3 instanceof p280q0.C5540g.a
            if (r0 != 0) goto L17
            if (r3 != 0) goto L11
            goto L17
        L11:
            q0.g$a r0 = new q0.g$a
            r0.<init>(r3, r2)
            return r0
        L17:
            return r3
    }
}
