package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.s0 */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0302s0 extends p300r0.AbstractC5760c implements android.view.View.OnClickListener {

    /* renamed from: w0 */
    public static final /* synthetic */ int f1413w0 = 0;

    /* renamed from: j0 */
    public final androidx.appcompat.widget.SearchView f1414j0;

    /* renamed from: k0 */
    public final android.app.SearchableInfo f1415k0;

    /* renamed from: l0 */
    public final android.content.Context f1416l0;

    /* renamed from: m0 */
    public final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> f1417m0;

    /* renamed from: n0 */
    public final int f1418n0;

    /* renamed from: o0 */
    public int f1419o0;

    /* renamed from: p0 */
    public android.content.res.ColorStateList f1420p0;

    /* renamed from: q0 */
    public int f1421q0;

    /* renamed from: r0 */
    public int f1422r0;

    /* renamed from: s0 */
    public int f1423s0;

    /* renamed from: t0 */
    public int f1424t0;

    /* renamed from: u0 */
    public int f1425u0;

    /* renamed from: v0 */
    public int f1426v0;

    /* renamed from: androidx.appcompat.widget.s0$a */
    public static final class a {

        /* renamed from: a */
        public final android.widget.TextView f1427a;

        /* renamed from: b */
        public final android.widget.TextView f1428b;

        /* renamed from: c */
        public final android.widget.ImageView f1429c;

        /* renamed from: d */
        public final android.widget.ImageView f1430d;

        /* renamed from: e */
        public final android.widget.ImageView f1431e;

        public a(android.view.View r2) {
                r1 = this;
                r1.<init>()
                r0 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.f1427a = r0
                r0 = 16908309(0x1020015, float:2.3877288E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.f1428b = r0
                r0 = 16908295(0x1020007, float:2.387725E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.f1429c = r0
                r0 = 16908296(0x1020008, float:2.3877251E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.f1430d = r0
                r0 = 2131362124(0x7f0a014c, float:1.834402E38)
                android.view.View r2 = r2.findViewById(r0)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r1.f1431e = r2
                return
        }
    }

    public ViewOnClickListenerC0302s0(android.content.Context r4, androidx.appcompat.widget.SearchView r5, android.app.SearchableInfo r6, java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> r7) {
            r3 = this;
            int r0 = r5.getSuggestionRowLayout()
            r1 = 0
            r2 = 1
            r3.<init>(r4, r0, r1, r2)
            r3.f1419o0 = r2
            r0 = -1
            r3.f1421q0 = r0
            r3.f1422r0 = r0
            r3.f1423s0 = r0
            r3.f1424t0 = r0
            r3.f1425u0 = r0
            r3.f1426v0 = r0
            r3.f1414j0 = r5
            r3.f1415k0 = r6
            int r5 = r5.getSuggestionCommitIconResId()
            r3.f1418n0 = r5
            r3.f1416l0 = r4
            r3.f1417m0 = r7
            return
    }

    /* renamed from: h */
    public static java.lang.String m778h(android.database.Cursor r2, int r3) {
            r0 = 0
            r1 = -1
            if (r3 != r1) goto L5
            return r0
        L5:
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Exception -> La
            return r2
        La:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r1 = "unexpected error retrieving valid column from cursor, did the remote process die?"
            android.util.Log.e(r3, r1, r2)
            return r0
    }

    @Override // p300r0.AbstractC5758a
    /* renamed from: a */
    public void mo779a(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
            r17 = this;
            r1 = r17
            r2 = r20
            java.lang.Object r0 = r18.getTag()
            r3 = r0
            androidx.appcompat.widget.s0$a r3 = (androidx.appcompat.widget.ViewOnClickListenerC0302s0.a) r3
            int r0 = r1.f1426v0
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L17
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L19
        L17:
            r0 = 0
            r6 = 0
        L19:
            android.widget.TextView r0 = r3.f1427a
            if (r0 == 0) goto L35
            int r0 = r1.f1421q0
            java.lang.String r0 = m778h(r2, r0)
            android.widget.TextView r7 = r3.f1427a
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L31
            r0 = 8
            goto L32
        L31:
            r0 = 0
        L32:
            r7.setVisibility(r0)
        L35:
            android.widget.TextView r0 = r3.f1428b
            r7 = 2
            r8 = 1
            if (r0 == 0) goto Lbc
            int r0 = r1.f1423s0
            java.lang.String r0 = m778h(r2, r0)
            if (r0 == 0) goto L85
            android.content.res.ColorStateList r9 = r1.f1420p0
            if (r9 != 0) goto L66
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.Context r10 = r1.f1416l0
            android.content.res.Resources$Theme r10 = r10.getTheme()
            r11 = 2130969568(0x7f0403e0, float:1.7547822E38)
            r10.resolveAttribute(r11, r9, r8)
            android.content.Context r10 = r1.f1416l0
            android.content.res.Resources r10 = r10.getResources()
            int r9 = r9.resourceId
            android.content.res.ColorStateList r9 = r10.getColorStateList(r9)
            r1.f1420p0 = r9
        L66:
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r11 = 0
            r12 = 0
            r13 = 0
            android.content.res.ColorStateList r14 = r1.f1420p0
            r16 = 0
            r10 = r15
            r5 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            int r0 = r0.length()
            r10 = 33
            r9.setSpan(r5, r4, r0, r10)
            goto L8b
        L85:
            int r0 = r1.f1422r0
            java.lang.String r9 = m778h(r2, r0)
        L8b:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L9e
            android.widget.TextView r0 = r3.f1427a
            if (r0 == 0) goto Laa
            r0.setSingleLine(r4)
            android.widget.TextView r0 = r3.f1427a
            r0.setMaxLines(r7)
            goto Laa
        L9e:
            android.widget.TextView r0 = r3.f1427a
            if (r0 == 0) goto Laa
            r0.setSingleLine(r8)
            android.widget.TextView r0 = r3.f1427a
            r0.setMaxLines(r8)
        Laa:
            android.widget.TextView r0 = r3.f1428b
            r0.setText(r9)
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 == 0) goto Lb8
            r5 = 8
            goto Lb9
        Lb8:
            r5 = 0
        Lb9:
            r0.setVisibility(r5)
        Lbc:
            android.widget.ImageView r5 = r3.f1429c
            r9 = 0
            if (r5 == 0) goto L16b
            int r0 = r1.f1424t0
            r10 = -1
            if (r0 != r10) goto Lc9
            r0 = r9
            goto L158
        Lc9:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.m784f(r0)
            if (r0 == 0) goto Ld5
            goto L158
        Ld5:
            android.app.SearchableInfo r0 = r1.f1415k0
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r10 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r11 = r1.f1417m0
            boolean r11 = r11.containsKey(r10)
            if (r11 == 0) goto Lfe
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f1417m0
            java.lang.Object r0 = r0.get(r10)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto Lf3
            r0 = r9
            goto L14b
        Lf3:
            android.content.Context r10 = r1.f1416l0
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r10)
            goto L14b
        Lfe:
            android.content.Context r11 = r1.f1416l0
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            r12 = 128(0x80, float:1.8E-43)
            android.content.pm.ActivityInfo r12 = r11.getActivityInfo(r0, r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L131
            int r13 = r12.getIconResource()
            if (r13 != 0) goto L111
            goto L13c
        L111:
            java.lang.String r14 = r0.getPackageName()
            android.content.pm.ApplicationInfo r12 = r12.applicationInfo
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r14, r13, r12)
            if (r11 != 0) goto L13d
            java.lang.String r11 = "Invalid icon resource "
            java.lang.String r12 = " for "
            java.lang.StringBuilder r11 = androidx.appcompat.widget.C0300r0.m777a(r11, r13, r12)
            java.lang.String r0 = r0.flattenToShortString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            goto L137
        L131:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = r11.toString()
        L137:
            java.lang.String r11 = "SuggestionsAdapter"
            android.util.Log.w(r11, r0)
        L13c:
            r11 = r9
        L13d:
            if (r11 != 0) goto L141
            r0 = r9
            goto L145
        L141:
            android.graphics.drawable.Drawable$ConstantState r0 = r11.getConstantState()
        L145:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.f1417m0
            r12.put(r10, r0)
            r0 = r11
        L14b:
            if (r0 == 0) goto L14e
            goto L158
        L14e:
            android.content.Context r0 = r1.f1416l0
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L158:
            r10 = 4
            r5.setImageDrawable(r0)
            if (r0 != 0) goto L162
            r5.setVisibility(r10)
            goto L16b
        L162:
            r5.setVisibility(r4)
            r0.setVisible(r4, r4)
            r0.setVisible(r8, r4)
        L16b:
            android.widget.ImageView r0 = r3.f1430d
            if (r0 == 0) goto L191
            int r5 = r1.f1425u0
            r10 = -1
            if (r5 != r10) goto L175
            goto L17d
        L175:
            java.lang.String r2 = r2.getString(r5)
            android.graphics.drawable.Drawable r9 = r1.m784f(r2)
        L17d:
            r0.setImageDrawable(r9)
            if (r9 != 0) goto L188
            r2 = 8
            r0.setVisibility(r2)
            goto L191
        L188:
            r0.setVisibility(r4)
            r9.setVisible(r4, r4)
            r9.setVisible(r8, r4)
        L191:
            int r0 = r1.f1419o0
            if (r0 == r7) goto L1a4
            if (r0 != r8) goto L19c
            r0 = r6 & 1
            if (r0 == 0) goto L19c
            goto L1a4
        L19c:
            android.widget.ImageView r0 = r3.f1431e
            r2 = 8
            r0.setVisibility(r2)
            goto L1b9
        L1a4:
            android.widget.ImageView r0 = r3.f1431e
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r3.f1431e
            android.widget.TextView r2 = r3.f1427a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f1431e
            r0.setOnClickListener(r1)
        L1b9:
            return
    }

    @Override // p300r0.AbstractC5758a
    /* renamed from: b */
    public void mo780b(android.database.Cursor r3) {
            r2 = this;
            super.mo780b(r3)     // Catch: java.lang.Exception -> L36
            if (r3 == 0) goto L3e
            java.lang.String r0 = "suggest_text_1"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r2.f1421q0 = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_text_2"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r2.f1422r0 = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_text_2_url"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r2.f1423s0 = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_icon_1"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r2.f1424t0 = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_icon_2"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r2.f1425u0 = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_flags"
            int r3 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r2.f1426v0 = r3     // Catch: java.lang.Exception -> L36
            goto L3e
        L36:
            r3 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "error changing cursor and caching columns"
            android.util.Log.e(r0, r1, r3)
        L3e:
            return
    }

    @Override // p300r0.AbstractC5758a
    /* renamed from: c */
    public java.lang.CharSequence mo781c(android.database.Cursor r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "suggest_intent_query"
            int r1 = r3.getColumnIndex(r1)
            java.lang.String r1 = m778h(r3, r1)
            if (r1 == 0) goto L11
            return r1
        L11:
            android.app.SearchableInfo r1 = r2.f1415k0
            boolean r1 = r1.shouldRewriteQueryFromData()
            if (r1 == 0) goto L26
            java.lang.String r1 = "suggest_intent_data"
            int r1 = r3.getColumnIndex(r1)
            java.lang.String r1 = m778h(r3, r1)
            if (r1 == 0) goto L26
            return r1
        L26:
            android.app.SearchableInfo r1 = r2.f1415k0
            boolean r1 = r1.shouldRewriteQueryFromText()
            if (r1 == 0) goto L3b
            java.lang.String r1 = "suggest_text_1"
            int r1 = r3.getColumnIndex(r1)
            java.lang.String r3 = m778h(r3, r1)
            if (r3 == 0) goto L3b
            return r3
        L3b:
            return r0
    }

    @Override // p300r0.AbstractC5758a
    /* renamed from: d */
    public android.view.View mo782d(android.content.Context r2, android.database.Cursor r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.LayoutInflater r2 = r1.f22180i0
            int r3 = r1.f22178g0
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r4, r0)
            androidx.appcompat.widget.s0$a r3 = new androidx.appcompat.widget.s0$a
            r3.<init>(r2)
            r2.setTag(r3)
            r3 = 2131362124(0x7f0a014c, float:1.834402E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            int r4 = r1.f1418n0
            r3.setImageResource(r4)
            return r2
    }

    /* renamed from: e */
    public android.graphics.drawable.Drawable m783e(android.net.Uri r8) {
            r7 = this;
            java.lang.String r0 = r8.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L83
            android.content.Context r1 = r7.f1416l0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            android.content.res.Resources r1 = r1.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.util.List r2 = r8.getPathSegments()
            if (r2 == 0) goto L6b
            int r3 = r2.size()
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L39
            java.lang.Object r0 = r2.get(r4)     // Catch: java.lang.NumberFormatException -> L2d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L2d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2d
            goto L4c
        L2d:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "Single path segment is not a resource ID: "
            java.lang.String r8 = androidx.appcompat.widget.C0298q0.m776a(r1, r8)
            r0.<init>(r8)
            throw r0
        L39:
            r6 = 2
            if (r3 != r6) goto L5f
            java.lang.Object r3 = r2.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r1.getIdentifier(r3, r2, r0)
        L4c:
            if (r0 == 0) goto L53
            android.graphics.drawable.Drawable r8 = r1.getDrawable(r0)
            return r8
        L53:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "No resource found for: "
            java.lang.String r8 = androidx.appcompat.widget.C0298q0.m776a(r1, r8)
            r0.<init>(r8)
            throw r0
        L5f:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "More than two path segments: "
            java.lang.String r8 = androidx.appcompat.widget.C0298q0.m776a(r1, r8)
            r0.<init>(r8)
            throw r0
        L6b:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "No path: "
            java.lang.String r8 = androidx.appcompat.widget.C0298q0.m776a(r1, r8)
            r0.<init>(r8)
            throw r0
        L77:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "No package found for authority: "
            java.lang.String r8 = androidx.appcompat.widget.C0298q0.m776a(r1, r8)
            r0.<init>(r8)
            throw r0
        L83:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "No authority: "
            java.lang.String r8 = androidx.appcompat.widget.C0298q0.m776a(r1, r8)
            r0.<init>(r8)
            throw r0
    }

    /* renamed from: f */
    public final android.graphics.drawable.Drawable m784f(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            r1 = 0
            if (r8 == 0) goto L13d
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L13d
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L15
            goto L13d
        L15:
            int r2 = java.lang.Integer.parseInt(r8)     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            r3.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            java.lang.String r4 = "android.resource://"
            r3.append(r4)     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            android.content.Context r4 = r7.f1416l0     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            r3.append(r4)     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            r3.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            java.lang.String r3 = r3.toString()     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.f1417m0     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            java.lang.Object r4 = r4.get(r3)     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            if (r4 != 0) goto L44
            r4 = r1
            goto L48
        L44:
            android.graphics.drawable.Drawable r4 = r4.newDrawable()     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
        L48:
            if (r4 == 0) goto L4b
            return r4
        L4b:
            android.content.Context r4 = r7.f1416l0     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            java.lang.Object r5 = p046d0.C1259a.f6733a     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            android.graphics.drawable.Drawable r2 = p046d0.C1259a.b.m3710b(r4, r2)     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            if (r2 == 0) goto L5e
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.f1417m0     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            android.graphics.drawable.Drawable$ConstantState r5 = r2.getConstantState()     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
            r4.put(r3, r5)     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.NumberFormatException -> L74
        L5e:
            return r2
        L5f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon resource not found: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.w(r0, r8)
            return r1
        L74:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r2 = r7.f1417m0
            java.lang.Object r2 = r2.get(r8)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L81
            r2 = r1
            goto L85
        L81:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L85:
            if (r2 == 0) goto L88
            return r2
        L88:
            android.net.Uri r2 = android.net.Uri.parse(r8)
            java.lang.String r3 = "Error closing icon stream for "
            java.lang.String r4 = r2.getScheme()     // Catch: java.io.FileNotFoundException -> L111
            java.lang.String r5 = "android.resource"
            boolean r4 = r5.equals(r4)     // Catch: java.io.FileNotFoundException -> L111
            if (r4 == 0) goto Lb8
            android.graphics.drawable.Drawable r0 = r7.m783e(r2)     // Catch: android.content.res.Resources.NotFoundException -> La1 java.io.FileNotFoundException -> L111
            r1 = r0
            goto L132
        La1:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L111
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L111
            r4.<init>()     // Catch: java.io.FileNotFoundException -> L111
            java.lang.String r5 = "Resource does not exist: "
            r4.append(r5)     // Catch: java.io.FileNotFoundException -> L111
            r4.append(r2)     // Catch: java.io.FileNotFoundException -> L111
            java.lang.String r4 = r4.toString()     // Catch: java.io.FileNotFoundException -> L111
            r3.<init>(r4)     // Catch: java.io.FileNotFoundException -> L111
            throw r3     // Catch: java.io.FileNotFoundException -> L111
        Lb8:
            android.content.Context r4 = r7.f1416l0     // Catch: java.io.FileNotFoundException -> L111
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.io.FileNotFoundException -> L111
            java.io.InputStream r4 = r4.openInputStream(r2)     // Catch: java.io.FileNotFoundException -> L111
            if (r4 == 0) goto Lfa
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r4, r1)     // Catch: java.lang.Throwable -> Le1
            r4.close()     // Catch: java.io.IOException -> Lcc
            goto Ldf
        Lcc:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L111
            r6.<init>()     // Catch: java.io.FileNotFoundException -> L111
            r6.append(r3)     // Catch: java.io.FileNotFoundException -> L111
            r6.append(r2)     // Catch: java.io.FileNotFoundException -> L111
            java.lang.String r3 = r6.toString()     // Catch: java.io.FileNotFoundException -> L111
            android.util.Log.e(r0, r3, r4)     // Catch: java.io.FileNotFoundException -> L111
        Ldf:
            r1 = r5
            goto L132
        Le1:
            r5 = move-exception
            r4.close()     // Catch: java.io.IOException -> Le6
            goto Lf9
        Le6:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L111
            r6.<init>()     // Catch: java.io.FileNotFoundException -> L111
            r6.append(r3)     // Catch: java.io.FileNotFoundException -> L111
            r6.append(r2)     // Catch: java.io.FileNotFoundException -> L111
            java.lang.String r3 = r6.toString()     // Catch: java.io.FileNotFoundException -> L111
            android.util.Log.e(r0, r3, r4)     // Catch: java.io.FileNotFoundException -> L111
        Lf9:
            throw r5     // Catch: java.io.FileNotFoundException -> L111
        Lfa:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L111
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L111
            r4.<init>()     // Catch: java.io.FileNotFoundException -> L111
            java.lang.String r5 = "Failed to open "
            r4.append(r5)     // Catch: java.io.FileNotFoundException -> L111
            r4.append(r2)     // Catch: java.io.FileNotFoundException -> L111
            java.lang.String r4 = r4.toString()     // Catch: java.io.FileNotFoundException -> L111
            r3.<init>(r4)     // Catch: java.io.FileNotFoundException -> L111
            throw r3     // Catch: java.io.FileNotFoundException -> L111
        L111:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Icon not found: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
        L132:
            if (r1 == 0) goto L13d
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r7.f1417m0
            android.graphics.drawable.Drawable$ConstantState r2 = r1.getConstantState()
            r0.put(r8, r2)
        L13d:
            return r1
    }

    /* renamed from: g */
    public android.database.Cursor m785g(android.app.SearchableInfo r10, java.lang.String r11, int r12) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r10.getSuggestAuthority()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r1 = r2.authority(r1)
            java.lang.String r2 = ""
            android.net.Uri$Builder r1 = r1.query(r2)
            android.net.Uri$Builder r1 = r1.fragment(r2)
            java.lang.String r2 = r10.getSuggestPath()
            if (r2 == 0) goto L2d
            r1.appendEncodedPath(r2)
        L2d:
            java.lang.String r2 = "search_suggest_query"
            r1.appendPath(r2)
            java.lang.String r6 = r10.getSuggestSelection()
            if (r6 == 0) goto L3f
            r10 = 1
            java.lang.String[] r0 = new java.lang.String[r10]
            r10 = 0
            r0[r10] = r11
            goto L42
        L3f:
            r1.appendPath(r11)
        L42:
            r7 = r0
            if (r12 <= 0) goto L4e
            java.lang.String r10 = java.lang.String.valueOf(r12)
            java.lang.String r11 = "limit"
            r1.appendQueryParameter(r11, r10)
        L4e:
            android.net.Uri r4 = r1.build()
            android.content.Context r10 = r9.f1416l0
            android.content.ContentResolver r3 = r10.getContentResolver()
            r5 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // p300r0.AbstractC5758a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            android.view.View r3 = super.getDropDownView(r3, r4, r5)     // Catch: java.lang.RuntimeException -> L5
            return r3
        L5:
            r3 = move-exception
            java.lang.String r4 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions cursor threw exception."
            android.util.Log.w(r4, r0, r3)
            android.view.LayoutInflater r4 = r2.f22180i0
            int r0 = r2.f22179h0
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
            if (r4 == 0) goto L27
            java.lang.Object r5 = r4.getTag()
            androidx.appcompat.widget.s0$a r5 = (androidx.appcompat.widget.ViewOnClickListenerC0302s0.a) r5
            android.widget.TextView r5 = r5.f1427a
            java.lang.String r3 = r3.toString()
            r5.setText(r3)
        L27:
            return r4
    }

    @Override // p300r0.AbstractC5758a, android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.View r2 = super.getView(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions cursor threw exception."
            android.util.Log.w(r3, r0, r2)
            android.content.Context r3 = r1.f1416l0
            android.database.Cursor r0 = r1.f22169a0
            android.view.View r3 = r1.mo782d(r3, r0, r4)
            java.lang.Object r4 = r3.getTag()
            androidx.appcompat.widget.s0$a r4 = (androidx.appcompat.widget.ViewOnClickListenerC0302s0.a) r4
            android.widget.TextView r4 = r4.f1427a
            java.lang.String r2 = r2.toString()
            r4.setText(r2)
            return r3
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r2 = this;
            super.notifyDataSetChanged()
            android.database.Cursor r0 = r2.f22169a0
            if (r0 == 0) goto Lc
            android.os.Bundle r0 = r0.getExtras()
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L14
            java.lang.String r1 = "in_progress"
            r0.getBoolean(r1)
        L14:
            return
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
            r2 = this;
            super.notifyDataSetInvalidated()
            android.database.Cursor r0 = r2.f22169a0
            if (r0 == 0) goto Lc
            android.os.Bundle r0 = r0.getExtras()
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L14
            java.lang.String r1 = "in_progress"
            r0.getBoolean(r1)
        L14:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            java.lang.Object r2 = r2.getTag()
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto Lf
            androidx.appcompat.widget.SearchView r0 = r1.f1414j0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.m600s(r2)
        Lf:
            return
    }
}
