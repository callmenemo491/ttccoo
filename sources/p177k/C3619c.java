package p177k;

/* renamed from: k.c */
/* loaded from: classes.dex */
public class C3619c extends android.content.ContextWrapper {

    /* renamed from: a */
    public int f15937a;

    /* renamed from: b */
    public android.content.res.Resources.Theme f15938b;

    /* renamed from: c */
    public android.view.LayoutInflater f15939c;

    /* renamed from: d */
    public android.content.res.Configuration f15940d;

    /* renamed from: e */
    public android.content.res.Resources f15941e;

    public C3619c() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public C3619c(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f15937a = r2
            return
    }

    public C3619c(android.content.Context r1, android.content.res.Resources.Theme r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f15938b = r2
            return
    }

    /* renamed from: a */
    public void m8060a(android.content.res.Configuration r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f15941e
            if (r0 != 0) goto L18
            android.content.res.Configuration r0 = r1.f15940d
            if (r0 != 0) goto L10
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>(r2)
            r1.f15940d = r0
            return
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Override configuration has already been set"
            r2.<init>(r0)
            throw r2
        L18:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "getResources() or getAssets() has already been called"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            return
    }

    /* renamed from: b */
    public final void m8061b() {
            r3 = this;
            android.content.res.Resources$Theme r0 = r3.f15938b
            r1 = 1
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L23
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r3.f15938b = r0
            android.content.Context r0 = r3.getBaseContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            if (r0 == 0) goto L23
            android.content.res.Resources$Theme r2 = r3.f15938b
            r2.setTo(r0)
        L23:
            android.content.res.Resources$Theme r0 = r3.f15938b
            int r2 = r3.f15937a
            r0.applyStyle(r2, r1)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = r1.f15941e
            if (r0 != 0) goto L17
            android.content.res.Configuration r0 = r1.f15940d
            if (r0 != 0) goto Ld
            android.content.res.Resources r0 = super.getResources()
            goto L15
        Ld:
            android.content.Context r0 = r1.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
        L15:
            r1.f15941e = r0
        L17:
            android.content.res.Resources r0 = r1.f15941e
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "layout_inflater"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            android.view.LayoutInflater r2 = r1.f15939c
            if (r2 != 0) goto L1a
            android.content.Context r2 = r1.getBaseContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.f15939c = r2
        L1a:
            android.view.LayoutInflater r2 = r1.f15939c
            return r2
        L1d:
            android.content.Context r0 = r1.getBaseContext()
            java.lang.Object r2 = r0.getSystemService(r2)
            return r2
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.f15938b
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.f15937a
            if (r0 != 0) goto Le
            r0 = 2132017689(0x7f140219, float:1.9673664E38)
            r1.f15937a = r0
        Le:
            r1.m8061b()
            android.content.res.Resources$Theme r0 = r1.f15938b
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r2) {
            r1 = this;
            int r0 = r1.f15937a
            if (r0 == r2) goto L9
            r1.f15937a = r2
            r1.m8061b()
        L9:
            return
    }
}
