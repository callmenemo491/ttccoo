package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public class C0211e implements p138i0.InterfaceMenuC3055a {

    /* renamed from: y */
    public static final int[] f807y = null;

    /* renamed from: a */
    public final android.content.Context f808a;

    /* renamed from: b */
    public final android.content.res.Resources f809b;

    /* renamed from: c */
    public boolean f810c;

    /* renamed from: d */
    public boolean f811d;

    /* renamed from: e */
    public androidx.appcompat.view.menu.C0211e.a f812e;

    /* renamed from: f */
    public java.util.ArrayList<androidx.appcompat.view.menu.C0213g> f813f;

    /* renamed from: g */
    public java.util.ArrayList<androidx.appcompat.view.menu.C0213g> f814g;

    /* renamed from: h */
    public boolean f815h;

    /* renamed from: i */
    public java.util.ArrayList<androidx.appcompat.view.menu.C0213g> f816i;

    /* renamed from: j */
    public java.util.ArrayList<androidx.appcompat.view.menu.C0213g> f817j;

    /* renamed from: k */
    public boolean f818k;

    /* renamed from: l */
    public int f819l;

    /* renamed from: m */
    public java.lang.CharSequence f820m;

    /* renamed from: n */
    public android.graphics.drawable.Drawable f821n;

    /* renamed from: o */
    public android.view.View f822o;

    /* renamed from: p */
    public boolean f823p;

    /* renamed from: q */
    public boolean f824q;

    /* renamed from: r */
    public boolean f825r;

    /* renamed from: s */
    public boolean f826s;

    /* renamed from: t */
    public java.util.ArrayList<androidx.appcompat.view.menu.C0213g> f827t;

    /* renamed from: u */
    public java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.InterfaceC0215i>> f828u;

    /* renamed from: v */
    public androidx.appcompat.view.menu.C0213g f829v;

    /* renamed from: w */
    public boolean f830w;

    /* renamed from: x */
    public boolean f831x;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    public interface a {
        /* renamed from: a */
        boolean mo523a(androidx.appcompat.view.menu.C0211e r1, android.view.MenuItem r2);

        /* renamed from: b */
        void mo524b(androidx.appcompat.view.menu.C0211e r1);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    public interface b {
        /* renamed from: a */
        boolean mo464a(androidx.appcompat.view.menu.C0213g r1);
    }

    static {
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 4, 5, 3, 2, 0} // fill-array
            androidx.appcompat.view.menu.C0211e.f807y = r0
            return
    }

    public C0211e(android.content.Context r6) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f819l = r0
            r5.f823p = r0
            r5.f824q = r0
            r5.f825r = r0
            r5.f826s = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f827t = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r5.f828u = r1
            r5.f830w = r0
            r5.f808a = r6
            android.content.res.Resources r1 = r6.getResources()
            r5.f809b = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.f813f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.f814g = r2
            r2 = 1
            r5.f815h = r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.f816i = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.f817j = r3
            r5.f818k = r2
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.keyboard
            if (r1 == r2) goto L7c
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r6)
            java.lang.reflect.Method r3 = p227n0.C4663v.f18589a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L60
            boolean r6 = r1.shouldShowMenuShortcutsWhenKeyboardPresent()
            goto L79
        L60:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r1 = "config_showMenuShortcutsWhenKeyboardPresent"
            java.lang.String r3 = "bool"
            java.lang.String r4 = "android"
            int r1 = r6.getIdentifier(r1, r3, r4)
            if (r1 == 0) goto L78
            boolean r6 = r6.getBoolean(r1)
            if (r6 == 0) goto L78
            r6 = 1
            goto L79
        L78:
            r6 = 0
        L79:
            if (r6 == 0) goto L7c
            r0 = 1
        L7c:
            r5.f811d = r0
            return
    }

    /* renamed from: a */
    public android.view.MenuItem mo498a(int r11, int r12, int r13, java.lang.CharSequence r14) {
            r10 = this;
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r13
            int r0 = r0 >> 16
            if (r0 < 0) goto L42
            int[] r1 = androidx.appcompat.view.menu.C0211e.f807y
            int r2 = r1.length
            if (r0 >= r2) goto L42
            r0 = r1[r0]
            int r0 = r0 << 16
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r13
            r0 = r0 | r1
            int r9 = r10.f819l
            androidx.appcompat.view.menu.g r1 = new androidx.appcompat.view.menu.g
            r2 = r1
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r0
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList<androidx.appcompat.view.menu.g> r11 = r10.f813f
            int r12 = r11.size()
        L29:
            int r12 = r12 + (-1)
            r13 = 1
            if (r12 < 0) goto L3a
            java.lang.Object r14 = r11.get(r12)
            androidx.appcompat.view.menu.g r14 = (androidx.appcompat.view.menu.C0213g) r14
            int r14 = r14.f842d
            if (r14 > r0) goto L29
            int r12 = r12 + r13
            goto L3b
        L3a:
            r12 = 0
        L3b:
            r11.add(r12, r1)
            r10.m513p(r13)
            return r1
        L42:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "order does not contain a valid category."
            r11.<init>(r12)
            throw r11
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f809b
            java.lang.String r2 = r0.getString(r2)
            r0 = 0
            android.view.MenuItem r2 = r1.mo498a(r0, r0, r0, r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.f809b
            java.lang.String r5 = r0.getString(r5)
            android.view.MenuItem r2 = r1.mo498a(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            android.view.MenuItem r1 = r0.mo498a(r1, r2, r3, r4)
            return r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.MenuItem r2 = r1.mo498a(r0, r0, r0, r2)
            return r2
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
            r7 = this;
            android.content.Context r0 = r7.f808a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L12
            int r2 = r11.size()
            goto L13
        L12:
            r2 = 0
        L13:
            r14 = r14 & 1
            if (r14 != 0) goto L1a
            r7.removeGroup(r8)
        L1a:
            if (r1 >= r2) goto L5e
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L2a
            r4 = r13
            goto L2c
        L2a:
            r4 = r12[r4]
        L2c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            android.view.MenuItem r4 = r7.mo498a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            android.view.MenuItem r4 = r4.setIcon(r5)
            android.view.MenuItem r3 = r4.setIntent(r3)
            if (r15 == 0) goto L5b
            int r14 = r14.specificIndex
            if (r14 < 0) goto L5b
            r15[r14] = r3
        L5b:
            int r1 = r1 + 1
            goto L1a
        L5e:
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f809b
            java.lang.String r2 = r0.getString(r2)
            r0 = 0
            android.view.SubMenu r2 = r1.addSubMenu(r0, r0, r0, r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.f809b
            java.lang.String r5 = r0.getString(r5)
            android.view.SubMenu r2 = r1.addSubMenu(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            android.view.MenuItem r1 = r0.mo498a(r1, r2, r3, r4)
            androidx.appcompat.view.menu.g r1 = (androidx.appcompat.view.menu.C0213g) r1
            androidx.appcompat.view.menu.l r2 = new androidx.appcompat.view.menu.l
            android.content.Context r3 = r0.f808a
            r2.<init>(r3, r0, r1)
            r1.f853o = r2
            java.lang.CharSequence r1 = r1.f843e
            r2.setHeaderTitle(r1)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.SubMenu r2 = r1.addSubMenu(r0, r0, r0, r2)
            return r2
    }

    /* renamed from: b */
    public void m499b(androidx.appcompat.view.menu.InterfaceC0215i r3, android.content.Context r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r0 = r2.f828u
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
            r3.mo493s(r4, r2)
            r3 = 1
            r2.f818k = r3
            return
    }

    /* renamed from: c */
    public final void m500c(boolean r4) {
            r3 = this;
            boolean r0 = r3.f826s
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.f826s = r0
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r0 = r3.f828u
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.i r2 = (androidx.appcompat.view.menu.InterfaceC0215i) r2
            if (r2 != 0) goto L28
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r2 = r3.f828u
            r2.remove(r1)
            goto Le
        L28:
            r2.mo472a(r3, r4)
            goto Le
        L2c:
            r4 = 0
            r3.f826s = r4
            return
    }

    @Override // android.view.Menu
    public void clear() {
            r1 = this;
            androidx.appcompat.view.menu.g r0 = r1.f829v
            if (r0 == 0) goto L7
            r1.mo501d(r0)
        L7:
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r1.f813f
            r0.clear()
            r0 = 1
            r1.m513p(r0)
            return
    }

    public void clearHeader() {
            r1 = this;
            r0 = 0
            r1.f821n = r0
            r1.f820m = r0
            r1.f822o = r0
            r0 = 0
            r1.m513p(r0)
            return
    }

    @Override // android.view.Menu
    public void close() {
            r1 = this;
            r0 = 1
            r1.m500c(r0)
            return
    }

    /* renamed from: d */
    public boolean mo501d(androidx.appcompat.view.menu.C0213g r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r0 = r4.f828u
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L3f
            androidx.appcompat.view.menu.g r0 = r4.f829v
            if (r0 == r5) goto Le
            goto L3f
        Le:
            r4.m522y()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r0 = r4.f828u
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.i r3 = (androidx.appcompat.view.menu.InterfaceC0215i) r3
            if (r3 != 0) goto L31
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r3 = r4.f828u
            r3.remove(r2)
            goto L17
        L31:
            boolean r1 = r3.mo470y(r4, r5)
            if (r1 == 0) goto L17
        L37:
            r4.m521x()
            if (r1 == 0) goto L3f
            r5 = 0
            r4.f829v = r5
        L3f:
            return r1
    }

    /* renamed from: e */
    public boolean mo502e(androidx.appcompat.view.menu.C0211e r2, android.view.MenuItem r3) {
            r1 = this;
            androidx.appcompat.view.menu.e$a r0 = r1.f812e
            if (r0 == 0) goto Lc
            boolean r2 = r0.mo523a(r2, r3)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    /* renamed from: f */
    public boolean mo503f(androidx.appcompat.view.menu.C0213g r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r0 = r4.f828u
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            r4.m522y()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r0 = r4.f828u
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.i r3 = (androidx.appcompat.view.menu.InterfaceC0215i) r3
            if (r3 != 0) goto L2d
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r3 = r4.f828u
            r3.remove(r2)
            goto L13
        L2d:
            boolean r1 = r3.mo471z(r4, r5)
            if (r1 == 0) goto L13
        L33:
            r4.m521x()
            if (r1 == 0) goto L3a
            r4.f829v = r5
        L3a:
            return r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L26
            java.util.ArrayList<androidx.appcompat.view.menu.g> r2 = r4.f813f
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.g r2 = (androidx.appcompat.view.menu.C0213g) r2
            int r3 = r2.f839a
            if (r3 != r5) goto L14
            return r2
        L14:
            boolean r3 = r2.hasSubMenu()
            if (r3 == 0) goto L23
            androidx.appcompat.view.menu.l r2 = r2.f853o
            android.view.MenuItem r2 = r2.findItem(r5)
            if (r2 == 0) goto L23
            return r2
        L23:
            int r1 = r1 + 1
            goto L5
        L26:
            r5 = 0
            return r5
    }

    /* renamed from: g */
    public androidx.appcompat.view.menu.C0213g m504g(int r12, android.view.KeyEvent r13) {
            r11 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r11.f827t
            r0.clear()
            r11.m505h(r0, r12, r13)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L10
            return r2
        L10:
            int r1 = r13.getMetaState()
            android.view.KeyCharacterMap$KeyData r3 = new android.view.KeyCharacterMap$KeyData
            r3.<init>()
            r13.getKeyData(r3)
            int r13 = r0.size()
            r4 = 1
            r5 = 0
            if (r13 != r4) goto L2b
            java.lang.Object r12 = r0.get(r5)
            androidx.appcompat.view.menu.g r12 = (androidx.appcompat.view.menu.C0213g) r12
            return r12
        L2b:
            boolean r4 = r11.mo511n()
            r6 = 0
        L30:
            if (r6 >= r13) goto L60
            java.lang.Object r7 = r0.get(r6)
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.C0213g) r7
            if (r4 == 0) goto L3d
            char r8 = r7.f848j
            goto L3f
        L3d:
            char r8 = r7.f846h
        L3f:
            char[] r9 = r3.meta
            char r10 = r9[r5]
            if (r8 != r10) goto L49
            r10 = r1 & 2
            if (r10 == 0) goto L5c
        L49:
            r10 = 2
            char r9 = r9[r10]
            if (r8 != r9) goto L52
            r9 = r1 & 2
            if (r9 != 0) goto L5c
        L52:
            if (r4 == 0) goto L5d
            r9 = 8
            if (r8 != r9) goto L5d
            r8 = 67
            if (r12 != r8) goto L5d
        L5c:
            return r7
        L5d:
            int r6 = r6 + 1
            goto L30
        L60:
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r1.f813f
            java.lang.Object r2 = r0.get(r2)
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            return r2
    }

    /* renamed from: h */
    public void m505h(java.util.List<androidx.appcompat.view.menu.C0213g> r13, int r14, android.view.KeyEvent r15) {
            r12 = this;
            boolean r0 = r12.mo511n()
            int r1 = r15.getModifiers()
            android.view.KeyCharacterMap$KeyData r2 = new android.view.KeyCharacterMap$KeyData
            r2.<init>()
            boolean r3 = r15.getKeyData(r2)
            r4 = 67
            if (r3 != 0) goto L18
            if (r14 == r4) goto L18
            return
        L18:
            java.util.ArrayList<androidx.appcompat.view.menu.g> r3 = r12.f813f
            int r3 = r3.size()
            r5 = 0
            r6 = 0
        L20:
            if (r6 >= r3) goto L71
            java.util.ArrayList<androidx.appcompat.view.menu.g> r7 = r12.f813f
            java.lang.Object r7 = r7.get(r6)
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.C0213g) r7
            boolean r8 = r7.hasSubMenu()
            if (r8 == 0) goto L35
            androidx.appcompat.view.menu.l r8 = r7.f853o
            r8.m505h(r13, r14, r15)
        L35:
            if (r0 == 0) goto L3a
            char r8 = r7.f848j
            goto L3c
        L3a:
            char r8 = r7.f846h
        L3c:
            if (r0 == 0) goto L41
            int r9 = r7.f849k
            goto L43
        L41:
            int r9 = r7.f847i
        L43:
            r10 = 69647(0x1100f, float:9.7596E-41)
            r11 = r1 & r10
            r9 = r9 & r10
            if (r11 != r9) goto L4d
            r9 = 1
            goto L4e
        L4d:
            r9 = 0
        L4e:
            if (r9 == 0) goto L6e
            if (r8 == 0) goto L6e
            char[] r9 = r2.meta
            char r10 = r9[r5]
            if (r8 == r10) goto L65
            r10 = 2
            char r9 = r9[r10]
            if (r8 == r9) goto L65
            if (r0 == 0) goto L6e
            r9 = 8
            if (r8 != r9) goto L6e
            if (r14 != r4) goto L6e
        L65:
            boolean r8 = r7.isEnabled()
            if (r8 == 0) goto L6e
            r13.add(r7)
        L6e:
            int r6 = r6 + 1
            goto L20
        L71:
            return
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
            r5 = this;
            boolean r0 = r5.f831x
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r5.size()
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r0) goto L20
            java.util.ArrayList<androidx.appcompat.view.menu.g> r4 = r5.f813f
            java.lang.Object r4 = r4.get(r3)
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0213g) r4
            boolean r4 = r4.isVisible()
            if (r4 == 0) goto L1d
            return r1
        L1d:
            int r3 = r3 + 1
            goto Lc
        L20:
            return r2
    }

    /* renamed from: i */
    public void m506i() {
            r6 = this;
            java.util.ArrayList r0 = r6.m509l()
            boolean r1 = r6.f818k
            if (r1 != 0) goto L9
            return
        L9:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r1 = r6.f828u
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L11:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r1.next()
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r5 = r4.get()
            androidx.appcompat.view.menu.i r5 = (androidx.appcompat.view.menu.InterfaceC0215i) r5
            if (r5 != 0) goto L2b
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r5 = r6.f828u
            r5.remove(r4)
            goto L11
        L2b:
            boolean r4 = r5.mo488w()
            r3 = r3 | r4
            goto L11
        L31:
            if (r3 == 0) goto L5b
            java.util.ArrayList<androidx.appcompat.view.menu.g> r1 = r6.f816i
            r1.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.g> r1 = r6.f817j
            r1.clear()
            int r1 = r0.size()
            r3 = 0
        L42:
            if (r3 >= r1) goto L6e
            java.lang.Object r4 = r0.get(r3)
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0213g) r4
            boolean r5 = r4.m533g()
            if (r5 == 0) goto L53
            java.util.ArrayList<androidx.appcompat.view.menu.g> r5 = r6.f816i
            goto L55
        L53:
            java.util.ArrayList<androidx.appcompat.view.menu.g> r5 = r6.f817j
        L55:
            r5.add(r4)
            int r3 = r3 + 1
            goto L42
        L5b:
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r6.f816i
            r0.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r6.f817j
            r0.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r6.f817j
            java.util.ArrayList r1 = r6.m509l()
            r0.addAll(r1)
        L6e:
            r6.f818k = r2
            return
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r1, android.view.KeyEvent r2) {
            r0 = this;
            androidx.appcompat.view.menu.g r1 = r0.m504g(r1, r2)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    /* renamed from: j */
    public java.lang.String mo507j() {
            r1 = this;
            java.lang.String r0 = "android:menu:actionviewstates"
            return r0
    }

    /* renamed from: k */
    public androidx.appcompat.view.menu.C0211e mo508k() {
            r0 = this;
            return r0
    }

    /* renamed from: l */
    public java.util.ArrayList<androidx.appcompat.view.menu.C0213g> m509l() {
            r5 = this;
            boolean r0 = r5.f815h
            if (r0 != 0) goto L7
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r5.f814g
            return r0
        L7:
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r5.f814g
            r0.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r5.f813f
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L14:
            if (r2 >= r0) goto L2c
            java.util.ArrayList<androidx.appcompat.view.menu.g> r3 = r5.f813f
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.g r3 = (androidx.appcompat.view.menu.C0213g) r3
            boolean r4 = r3.isVisible()
            if (r4 == 0) goto L29
            java.util.ArrayList<androidx.appcompat.view.menu.g> r4 = r5.f814g
            r4.add(r3)
        L29:
            int r2 = r2 + 1
            goto L14
        L2c:
            r5.f815h = r1
            r0 = 1
            r5.f818k = r0
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r5.f814g
            return r0
    }

    /* renamed from: m */
    public boolean mo510m() {
            r1 = this;
            boolean r0 = r1.f830w
            return r0
    }

    /* renamed from: n */
    public boolean mo511n() {
            r1 = this;
            boolean r0 = r1.f810c
            return r0
    }

    /* renamed from: o */
    public boolean mo512o() {
            r1 = this;
            boolean r0 = r1.f811d
            return r0
    }

    /* renamed from: p */
    public void m513p(boolean r4) {
            r3 = this;
            boolean r0 = r3.f823p
            r1 = 1
            if (r0 != 0) goto L3f
            if (r4 == 0) goto Lb
            r3.f815h = r1
            r3.f818k = r1
        Lb:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r0 = r3.f828u
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            goto L45
        L14:
            r3.m522y()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r0 = r3.f828u
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.i r2 = (androidx.appcompat.view.menu.InterfaceC0215i) r2
            if (r2 != 0) goto L37
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r2 = r3.f828u
            r2.remove(r1)
            goto L1d
        L37:
            r2.mo487v(r4)
            goto L1d
        L3b:
            r3.m521x()
            goto L45
        L3f:
            r3.f824q = r1
            if (r4 == 0) goto L45
            r3.f825r = r1
        L45:
            return
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r1, int r2) {
            r0 = this;
            android.view.MenuItem r1 = r0.findItem(r1)
            boolean r1 = r0.m514q(r1, r2)
            return r1
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r1, android.view.KeyEvent r2, int r3) {
            r0 = this;
            androidx.appcompat.view.menu.g r1 = r0.m504g(r1, r2)
            if (r1 == 0) goto Lc
            r2 = 0
            boolean r1 = r0.m515r(r1, r2, r3)
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r2 = r3 & 2
            if (r2 == 0) goto L15
            r2 = 1
            r0.m500c(r2)
        L15:
            return r1
    }

    /* renamed from: q */
    public boolean m514q(android.view.MenuItem r2, int r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.m515r(r2, r0, r3)
            return r2
    }

    /* renamed from: r */
    public boolean m515r(android.view.MenuItem r7, androidx.appcompat.view.menu.InterfaceC0215i r8, int r9) {
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.C0213g) r7
            r0 = 0
            if (r7 == 0) goto Lcc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcc
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f854p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L40
        L19:
            androidx.appcompat.view.menu.e r1 = r7.f852n
            boolean r1 = r1.mo502e(r1, r7)
            if (r1 == 0) goto L22
            goto L40
        L22:
            android.content.Intent r1 = r7.f845g
            if (r1 == 0) goto L36
            androidx.appcompat.view.menu.e r3 = r7.f852n     // Catch: android.content.ActivityNotFoundException -> L2e
            android.content.Context r3 = r3.f808a     // Catch: android.content.ActivityNotFoundException -> L2e
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L2e
            goto L40
        L2e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L36:
            n0.b r1 = r7.f835A
            if (r1 == 0) goto L42
            boolean r1 = r1.mo1475e()
            if (r1 == 0) goto L42
        L40:
            r1 = 1
            goto L43
        L42:
            r1 = 0
        L43:
            n0.b r3 = r7.f835A
            if (r3 == 0) goto L4f
            boolean r4 = r3.mo9206a()
            if (r4 == 0) goto L4f
            r4 = 1
            goto L50
        L4f:
            r4 = 0
        L50:
            boolean r5 = r7.m532f()
            if (r5 == 0) goto L5f
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lcb
            goto Lc8
        L5f:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6d
            if (r4 == 0) goto L68
            goto L6d
        L68:
            r7 = r9 & 1
            if (r7 != 0) goto Lcb
            goto Lc8
        L6d:
            r9 = r9 & 4
            if (r9 != 0) goto L74
            r6.m500c(r0)
        L74:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L88
            androidx.appcompat.view.menu.l r9 = new androidx.appcompat.view.menu.l
            android.content.Context r5 = r6.f808a
            r9.<init>(r5, r6, r7)
            r7.f853o = r9
            java.lang.CharSequence r5 = r7.f843e
            r9.setHeaderTitle(r5)
        L88:
            androidx.appcompat.view.menu.l r7 = r7.f853o
            if (r4 == 0) goto L8f
            r3.mo9207f(r7)
        L8f:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r9 = r6.f828u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L98
            goto Lc5
        L98:
            if (r8 == 0) goto L9e
            boolean r0 = r8.mo486u(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r8 = r6.f828u
            java.util.Iterator r8 = r8.iterator()
        La4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lc5
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.i r3 = (androidx.appcompat.view.menu.InterfaceC0215i) r3
            if (r3 != 0) goto Lbe
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r3 = r6.f828u
            r3.remove(r9)
            goto La4
        Lbe:
            if (r0 != 0) goto La4
            boolean r0 = r3.mo486u(r7)
            goto La4
        Lc5:
            r1 = r1 | r0
            if (r1 != 0) goto Lcb
        Lc8:
            r6.m500c(r2)
        Lcb:
            return r1
        Lcc:
            return r0
    }

    @Override // android.view.Menu
    public void removeGroup(int r6) {
            r5 = this;
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L18
            java.util.ArrayList<androidx.appcompat.view.menu.g> r3 = r5.f813f
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.g r3 = (androidx.appcompat.view.menu.C0213g) r3
            int r3 = r3.f840b
            if (r3 != r6) goto L15
            goto L19
        L15:
            int r2 = r2 + 1
            goto L6
        L18:
            r2 = -1
        L19:
            if (r2 < 0) goto L3c
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r5.f813f
            int r0 = r0.size()
            int r0 = r0 - r2
            r3 = 0
        L23:
            int r4 = r3 + 1
            if (r3 >= r0) goto L38
            java.util.ArrayList<androidx.appcompat.view.menu.g> r3 = r5.f813f
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.g r3 = (androidx.appcompat.view.menu.C0213g) r3
            int r3 = r3.f840b
            if (r3 != r6) goto L38
            r5.m516s(r2, r1)
            r3 = r4
            goto L23
        L38:
            r6 = 1
            r5.m513p(r6)
        L3c:
            return
    }

    @Override // android.view.Menu
    public void removeItem(int r4) {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L17
            java.util.ArrayList<androidx.appcompat.view.menu.g> r2 = r3.f813f
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.g r2 = (androidx.appcompat.view.menu.C0213g) r2
            int r2 = r2.f839a
            if (r2 != r4) goto L14
            goto L18
        L14:
            int r1 = r1 + 1
            goto L5
        L17:
            r1 = -1
        L18:
            r4 = 1
            r3.m516s(r1, r4)
            return
    }

    /* renamed from: s */
    public final void m516s(int r2, boolean r3) {
            r1 = this;
            if (r2 < 0) goto L16
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r1.f813f
            int r0 = r0.size()
            if (r2 < r0) goto Lb
            goto L16
        Lb:
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r1.f813f
            r0.remove(r2)
            if (r3 == 0) goto L16
            r2 = 1
            r1.m513p(r2)
        L16:
            return
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r5, boolean r6, boolean r7) {
            r4 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r4.f813f
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1e
            java.util.ArrayList<androidx.appcompat.view.menu.g> r2 = r4.f813f
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.g r2 = (androidx.appcompat.view.menu.C0213g) r2
            int r3 = r2.f840b
            if (r3 != r5) goto L1b
            r2.m537k(r7)
            r2.setCheckable(r6)
        L1b:
            int r1 = r1 + 1
            goto L7
        L1e:
            return
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean r1) {
            r0 = this;
            r0.f830w = r1
            return
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r5, boolean r6) {
            r4 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r4.f813f
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1b
            java.util.ArrayList<androidx.appcompat.view.menu.g> r2 = r4.f813f
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.g r2 = (androidx.appcompat.view.menu.C0213g) r2
            int r3 = r2.f840b
            if (r3 != r5) goto L18
            r2.setEnabled(r6)
        L18:
            int r1 = r1 + 1
            goto L7
        L1b:
            return
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r7, boolean r8) {
            r6 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r6.f813f
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            r3 = 1
            if (r1 >= r0) goto L21
            java.util.ArrayList<androidx.appcompat.view.menu.g> r4 = r6.f813f
            java.lang.Object r4 = r4.get(r1)
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0213g) r4
            int r5 = r4.f840b
            if (r5 != r7) goto L1e
            boolean r4 = r4.m539m(r8)
            if (r4 == 0) goto L1e
            r2 = 1
        L1e:
            int r1 = r1 + 1
            goto L8
        L21:
            if (r2 == 0) goto L26
            r6.m513p(r3)
        L26:
            return
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
            r0 = this;
            r0.f810c = r1
            r1 = 0
            r0.m513p(r1)
            return
    }

    @Override // android.view.Menu
    public int size() {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r1.f813f
            int r0 = r0.size()
            return r0
    }

    /* renamed from: t */
    public void m517t(androidx.appcompat.view.menu.InterfaceC0215i r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r0 = r3.f828u
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.i r2 = (androidx.appcompat.view.menu.InterfaceC0215i) r2
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L6
        L1c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r2 = r3.f828u
            r2.remove(r1)
            goto L6
        L22:
            return
    }

    /* renamed from: u */
    public void m518u(android.os.Bundle r8) {
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r7.mo507j()
            android.util.SparseArray r0 = r8.getSparseParcelableArray(r0)
            int r1 = r7.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L38
            android.view.MenuItem r3 = r7.getItem(r2)
            android.view.View r4 = r3.getActionView()
            if (r4 == 0) goto L26
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L26
            r4.restoreHierarchyState(r0)
        L26:
            boolean r4 = r3.hasSubMenu()
            if (r4 == 0) goto L35
            android.view.SubMenu r3 = r3.getSubMenu()
            androidx.appcompat.view.menu.l r3 = (androidx.appcompat.view.menu.SubMenuC0218l) r3
            r3.m518u(r8)
        L35:
            int r2 = r2 + 1
            goto L10
        L38:
            java.lang.String r0 = "android:menu:expandedactionview"
            int r8 = r8.getInt(r0)
            if (r8 <= 0) goto L49
            android.view.MenuItem r8 = r7.findItem(r8)
            if (r8 == 0) goto L49
            r8.expandActionView()
        L49:
            return
    }

    /* renamed from: v */
    public void m519v(android.os.Bundle r8) {
            r7 = this;
            int r0 = r7.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L44
            android.view.MenuItem r3 = r7.getItem(r2)
            android.view.View r4 = r3.getActionView()
            if (r4 == 0) goto L32
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L32
            if (r1 != 0) goto L20
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
        L20:
            r4.saveHierarchyState(r1)
            boolean r4 = r3.isActionViewExpanded()
            if (r4 == 0) goto L32
            int r4 = r3.getItemId()
            java.lang.String r5 = "android:menu:expandedactionview"
            r8.putInt(r5, r4)
        L32:
            boolean r4 = r3.hasSubMenu()
            if (r4 == 0) goto L41
            android.view.SubMenu r3 = r3.getSubMenu()
            androidx.appcompat.view.menu.l r3 = (androidx.appcompat.view.menu.SubMenuC0218l) r3
            r3.m519v(r8)
        L41:
            int r2 = r2 + 1
            goto L6
        L44:
            if (r1 == 0) goto L4d
            java.lang.String r0 = r7.mo507j()
            r8.putSparseParcelableArray(r0, r1)
        L4d:
            return
    }

    /* renamed from: w */
    public final void m520w(int r3, java.lang.CharSequence r4, int r5, android.graphics.drawable.Drawable r6, android.view.View r7) {
            r2 = this;
            android.content.res.Resources r0 = r2.f809b
            r1 = 0
            if (r7 == 0) goto Lc
            r2.f822o = r7
            r2.f820m = r1
            r2.f821n = r1
            goto L2c
        Lc:
            if (r3 <= 0) goto L15
            java.lang.CharSequence r3 = r0.getText(r3)
            r2.f820m = r3
            goto L19
        L15:
            if (r4 == 0) goto L19
            r2.f820m = r4
        L19:
            if (r5 <= 0) goto L26
            android.content.Context r3 = r2.f808a
            java.lang.Object r4 = p046d0.C1259a.f6733a
            android.graphics.drawable.Drawable r3 = p046d0.C1259a.b.m3710b(r3, r5)
            r2.f821n = r3
            goto L2a
        L26:
            if (r6 == 0) goto L2a
            r2.f821n = r6
        L2a:
            r2.f822o = r1
        L2c:
            r3 = 0
            r2.m513p(r3)
            return
    }

    /* renamed from: x */
    public void m521x() {
            r2 = this;
            r0 = 0
            r2.f823p = r0
            boolean r1 = r2.f824q
            if (r1 == 0) goto Le
            r2.f824q = r0
            boolean r0 = r2.f825r
            r2.m513p(r0)
        Le:
            return
    }

    /* renamed from: y */
    public void m522y() {
            r1 = this;
            boolean r0 = r1.f823p
            if (r0 != 0) goto Lc
            r0 = 1
            r1.f823p = r0
            r0 = 0
            r1.f824q = r0
            r1.f825r = r0
        Lc:
            return
    }
}
