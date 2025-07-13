package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public class C0209c implements androidx.appcompat.view.menu.InterfaceC0215i, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: Y */
    public android.content.Context f793Y;

    /* renamed from: Z */
    public android.view.LayoutInflater f794Z;

    /* renamed from: a0 */
    public androidx.appcompat.view.menu.C0211e f795a0;

    /* renamed from: b0 */
    public androidx.appcompat.view.menu.ExpandedMenuView f796b0;

    /* renamed from: c0 */
    public androidx.appcompat.view.menu.InterfaceC0215i.a f797c0;

    /* renamed from: d0 */
    public androidx.appcompat.view.menu.C0209c.a f798d0;

    /* renamed from: androidx.appcompat.view.menu.c$a */
    public class a extends android.widget.BaseAdapter {

        /* renamed from: Y */
        public int f799Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.appcompat.view.menu.C0209c f800Z;

        public a(androidx.appcompat.view.menu.C0209c r1) {
                r0 = this;
                r0.f800Z = r1
                r0.<init>()
                r1 = -1
                r0.f799Y = r1
                r0.m494a()
                return
        }

        /* renamed from: a */
        public void m494a() {
                r5 = this;
                androidx.appcompat.view.menu.c r0 = r5.f800Z
                androidx.appcompat.view.menu.e r0 = r0.f795a0
                androidx.appcompat.view.menu.g r1 = r0.f829v
                if (r1 == 0) goto L22
                r0.m506i()
                java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r0.f817j
                int r2 = r0.size()
                r3 = 0
            L12:
                if (r3 >= r2) goto L22
                java.lang.Object r4 = r0.get(r3)
                androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0213g) r4
                if (r4 != r1) goto L1f
                r5.f799Y = r3
                return
            L1f:
                int r3 = r3 + 1
                goto L12
            L22:
                r0 = -1
                r5.f799Y = r0
                return
        }

        /* renamed from: b */
        public androidx.appcompat.view.menu.C0213g m495b(int r3) {
                r2 = this;
                androidx.appcompat.view.menu.c r0 = r2.f800Z
                androidx.appcompat.view.menu.e r0 = r0.f795a0
                r0.m506i()
                java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r0.f817j
                androidx.appcompat.view.menu.c r1 = r2.f800Z
                java.util.Objects.requireNonNull(r1)
                int r3 = r3 + 0
                int r1 = r2.f799Y
                if (r1 < 0) goto L18
                if (r3 < r1) goto L18
                int r3 = r3 + 1
            L18:
                java.lang.Object r3 = r0.get(r3)
                androidx.appcompat.view.menu.g r3 = (androidx.appcompat.view.menu.C0213g) r3
                return r3
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r2 = this;
                androidx.appcompat.view.menu.c r0 = r2.f800Z
                androidx.appcompat.view.menu.e r0 = r0.f795a0
                r0.m506i()
                java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r0.f817j
                int r0 = r0.size()
                androidx.appcompat.view.menu.c r1 = r2.f800Z
                java.util.Objects.requireNonNull(r1)
                int r0 = r0 + 0
                int r1 = r2.f799Y
                if (r1 >= 0) goto L19
                return r0
            L19:
                int r0 = r0 + (-1)
                return r0
        }

        @Override // android.widget.Adapter
        public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
                r0 = this;
                androidx.appcompat.view.menu.g r1 = r0.m495b(r1)
                return r1
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
                r2 = this;
                r0 = 0
                if (r4 != 0) goto Le
                androidx.appcompat.view.menu.c r4 = r2.f800Z
                android.view.LayoutInflater r4 = r4.f794Z
                r1 = 2131558416(0x7f0d0010, float:1.8742147E38)
                android.view.View r4 = r4.inflate(r1, r5, r0)
            Le:
                r5 = r4
                androidx.appcompat.view.menu.j$a r5 = (androidx.appcompat.view.menu.InterfaceC0216j.a) r5
                androidx.appcompat.view.menu.g r3 = r2.m495b(r3)
                r5.mo459d(r3, r0)
                return r4
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
                r0 = this;
                r0.m494a()
                super.notifyDataSetChanged()
                return
        }
    }

    public C0209c(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f793Y = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.f794Z = r1
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: A */
    public void mo468A(androidx.appcompat.view.menu.InterfaceC0215i.a r1) {
            r0 = this;
            r0.f797c0 = r1
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: a */
    public void mo472a(androidx.appcompat.view.menu.C0211e r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.i$a r0 = r1.f797c0
            if (r0 == 0) goto L7
            r0.mo525a(r2, r3)
        L7:
            return
    }

    /* renamed from: b */
    public android.widget.ListAdapter m492b() {
            r1 = this;
            androidx.appcompat.view.menu.c$a r0 = r1.f798d0
            if (r0 != 0) goto Lb
            androidx.appcompat.view.menu.c$a r0 = new androidx.appcompat.view.menu.c$a
            r0.<init>(r1)
            r1.f798d0 = r0
        Lb:
            androidx.appcompat.view.menu.c$a r0 = r1.f798d0
            return r0
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.view.menu.e r1 = r0.f795a0
            androidx.appcompat.view.menu.c$a r2 = r0.f798d0
            androidx.appcompat.view.menu.g r2 = r2.m495b(r3)
            r3 = 0
            r1.m515r(r2, r0, r3)
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: r */
    public int mo469r() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: s */
    public void mo493s(android.content.Context r2, androidx.appcompat.view.menu.C0211e r3) {
            r1 = this;
            android.content.Context r0 = r1.f793Y
            if (r0 == 0) goto L10
            r1.f793Y = r2
            android.view.LayoutInflater r0 = r1.f794Z
            if (r0 != 0) goto L10
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.f794Z = r2
        L10:
            r1.f795a0 = r3
            androidx.appcompat.view.menu.c$a r2 = r1.f798d0
            if (r2 == 0) goto L19
            r2.notifyDataSetChanged()
        L19:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: t */
    public void mo485t(android.os.Parcelable r2) {
            r1 = this;
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "android:menu:list"
            android.util.SparseArray r2 = r2.getSparseParcelableArray(r0)
            if (r2 == 0) goto Lf
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r1.f796b0
            r0.restoreHierarchyState(r2)
        Lf:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: u */
    public boolean mo486u(androidx.appcompat.view.menu.SubMenuC0218l r6) {
            r5 = this;
            boolean r0 = r6.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.appcompat.view.menu.f r0 = new androidx.appcompat.view.menu.f
            r0.<init>(r6)
            androidx.appcompat.app.b$a r2 = new androidx.appcompat.app.b$a
            android.content.Context r3 = r6.f808a
            int r1 = androidx.appcompat.app.DialogC0204b.m455d(r3, r1)
            r2.<init>(r3, r1)
            androidx.appcompat.view.menu.c r1 = new androidx.appcompat.view.menu.c
            android.content.Context r3 = r2.getContext()
            r4 = 2131558416(0x7f0d0010, float:1.8742147E38)
            r1.<init>(r3, r4)
            r0.f834a0 = r1
            r1.f797c0 = r0
            androidx.appcompat.view.menu.e r3 = r0.f832Y
            android.content.Context r4 = r3.f808a
            r3.m499b(r1, r4)
            androidx.appcompat.view.menu.c r1 = r0.f834a0
            android.widget.ListAdapter r1 = r1.m492b()
            androidx.appcompat.app.AlertController$b r3 = r2.f715a
            r3.f706l = r1
            r3.f707m = r0
            android.view.View r1 = r6.f822o
            if (r1 == 0) goto L42
            r3.f699e = r1
            goto L4b
        L42:
            android.graphics.drawable.Drawable r1 = r6.f821n
            r3.f697c = r1
            java.lang.CharSequence r1 = r6.f820m
            r2.setTitle(r1)
        L4b:
            androidx.appcompat.app.AlertController$b r1 = r2.f715a
            r1.f705k = r0
            androidx.appcompat.app.b r1 = r2.create()
            r0.f833Z = r1
            r1.setOnDismissListener(r0)
            androidx.appcompat.app.b r1 = r0.f833Z
            android.view.Window r1 = r1.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r2 = 1003(0x3eb, float:1.406E-42)
            r1.type = r2
            int r2 = r1.flags
            r3 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r3
            r1.flags = r2
            androidx.appcompat.app.b r0 = r0.f833Z
            r0.show()
            androidx.appcompat.view.menu.i$a r0 = r5.f797c0
            if (r0 == 0) goto L79
            r0.mo526b(r6)
        L79:
            r6 = 1
            return r6
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: v */
    public void mo487v(boolean r1) {
            r0 = this;
            androidx.appcompat.view.menu.c$a r1 = r0.f798d0
            if (r1 == 0) goto L7
            r1.notifyDataSetChanged()
        L7:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: w */
    public boolean mo488w() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: x */
    public android.os.Parcelable mo489x() {
            r3 = this;
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r3.f796b0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            androidx.appcompat.view.menu.ExpandedMenuView r2 = r3.f796b0
            if (r2 == 0) goto L17
            r2.saveHierarchyState(r1)
        L17:
            java.lang.String r2 = "android:menu:list"
            r0.putSparseParcelableArray(r2, r1)
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: y */
    public boolean mo470y(androidx.appcompat.view.menu.C0211e r1, androidx.appcompat.view.menu.C0213g r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: z */
    public boolean mo471z(androidx.appcompat.view.menu.C0211e r1, androidx.appcompat.view.menu.C0213g r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
