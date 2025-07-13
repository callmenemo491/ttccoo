package p177k;

/* renamed from: k.e */
/* loaded from: classes.dex */
public class C3621e extends android.view.ActionMode {

    /* renamed from: a */
    public final android.content.Context f15948a;

    /* renamed from: b */
    public final p177k.AbstractC3617a f15949b;

    /* renamed from: k.e$a */
    public static class a implements p177k.AbstractC3617a.a {

        /* renamed from: a */
        public final android.view.ActionMode.Callback f15950a;

        /* renamed from: b */
        public final android.content.Context f15951b;

        /* renamed from: c */
        public final java.util.ArrayList<p177k.C3621e> f15952c;

        /* renamed from: d */
        public final p319s.C5941h<android.view.Menu, android.view.Menu> f15953d;

        public a(android.content.Context r1, android.view.ActionMode.Callback r2) {
                r0 = this;
                r0.<init>()
                r0.f15951b = r1
                r0.f15950a = r2
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f15952c = r1
                s.h r1 = new s.h
                r1.<init>()
                r0.f15953d = r1
                return
        }

        @Override // p177k.AbstractC3617a.a
        /* renamed from: a */
        public boolean mo4758a(p177k.AbstractC3617a r4, android.view.MenuItem r5) {
                r3 = this;
                android.view.ActionMode$Callback r0 = r3.f15950a
                android.view.ActionMode r4 = r3.m8062e(r4)
                l.c r1 = new l.c
                android.content.Context r2 = r3.f15951b
                i0.b r5 = (p138i0.InterfaceMenuItemC3056b) r5
                r1.<init>(r2, r5)
                boolean r4 = r0.onActionItemClicked(r4, r1)
                return r4
        }

        @Override // p177k.AbstractC3617a.a
        /* renamed from: b */
        public boolean mo4759b(p177k.AbstractC3617a r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f15950a
                android.view.ActionMode r2 = r1.m8062e(r2)
                android.view.Menu r3 = r1.m8063f(r3)
                boolean r2 = r0.onCreateActionMode(r2, r3)
                return r2
        }

        @Override // p177k.AbstractC3617a.a
        /* renamed from: c */
        public boolean mo4760c(p177k.AbstractC3617a r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f15950a
                android.view.ActionMode r2 = r1.m8062e(r2)
                android.view.Menu r3 = r1.m8063f(r3)
                boolean r2 = r0.onPrepareActionMode(r2, r3)
                return r2
        }

        @Override // p177k.AbstractC3617a.a
        /* renamed from: d */
        public void mo4761d(p177k.AbstractC3617a r2) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f15950a
                android.view.ActionMode r2 = r1.m8062e(r2)
                r0.onDestroyActionMode(r2)
                return
        }

        /* renamed from: e */
        public android.view.ActionMode m8062e(p177k.AbstractC3617a r5) {
                r4 = this;
                java.util.ArrayList<k.e> r0 = r4.f15952c
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L1b
                java.util.ArrayList<k.e> r2 = r4.f15952c
                java.lang.Object r2 = r2.get(r1)
                k.e r2 = (p177k.C3621e) r2
                if (r2 == 0) goto L18
                k.a r3 = r2.f15949b
                if (r3 != r5) goto L18
                return r2
            L18:
                int r1 = r1 + 1
                goto L7
            L1b:
                k.e r0 = new k.e
                android.content.Context r1 = r4.f15951b
                r0.<init>(r1, r5)
                java.util.ArrayList<k.e> r5 = r4.f15952c
                r5.add(r0)
                return r0
        }

        /* renamed from: f */
        public final android.view.Menu m8063f(android.view.Menu r4) {
                r3 = this;
                s.h<android.view.Menu, android.view.Menu> r0 = r3.f15953d
                r1 = 0
                java.lang.Object r0 = r0.getOrDefault(r4, r1)
                android.view.Menu r0 = (android.view.Menu) r0
                if (r0 != 0) goto L1a
                l.e r0 = new l.e
                android.content.Context r1 = r3.f15951b
                r2 = r4
                i0.a r2 = (p138i0.InterfaceMenuC3055a) r2
                r0.<init>(r1, r2)
                s.h<android.view.Menu, android.view.Menu> r1 = r3.f15953d
                r1.put(r4, r0)
            L1a:
                return r0
        }
    }

    public C3621e(android.content.Context r1, p177k.AbstractC3617a r2) {
            r0 = this;
            r0.<init>()
            r0.f15948a = r1
            r0.f15949b = r2
            return
    }

    @Override // android.view.ActionMode
    public void finish() {
            r1 = this;
            k.a r0 = r1.f15949b
            r0.mo4802c()
            return
    }

    @Override // android.view.ActionMode
    public android.view.View getCustomView() {
            r1 = this;
            k.a r0 = r1.f15949b
            android.view.View r0 = r0.mo4803d()
            return r0
    }

    @Override // android.view.ActionMode
    public android.view.Menu getMenu() {
            r3 = this;
            l.e r0 = new l.e
            android.content.Context r1 = r3.f15948a
            k.a r2 = r3.f15949b
            android.view.Menu r2 = r2.mo4804e()
            i0.a r2 = (p138i0.InterfaceMenuC3055a) r2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            k.a r0 = r1.f15949b
            android.view.MenuInflater r0 = r0.mo4805f()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            k.a r0 = r1.f15949b
            java.lang.CharSequence r0 = r0.mo4806g()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.Object getTag() {
            r1 = this;
            k.a r0 = r1.f15949b
            java.lang.Object r0 = r0.f15935Y
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getTitle() {
            r1 = this;
            k.a r0 = r1.f15949b
            java.lang.CharSequence r0 = r0.mo4807h()
            return r0
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
            r1 = this;
            k.a r0 = r1.f15949b
            boolean r0 = r0.f15936Z
            return r0
    }

    @Override // android.view.ActionMode
    public void invalidate() {
            r1 = this;
            k.a r0 = r1.f15949b
            r0.mo4808i()
            return
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
            r1 = this;
            k.a r0 = r1.f15949b
            boolean r0 = r0.mo4809j()
            return r0
    }

    @Override // android.view.ActionMode
    public void setCustomView(android.view.View r2) {
            r1 = this;
            k.a r0 = r1.f15949b
            r0.mo4810k(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int r2) {
            r1 = this;
            k.a r0 = r1.f15949b
            r0.mo4811l(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setSubtitle(java.lang.CharSequence r2) {
            r1 = this;
            k.a r0 = r1.f15949b
            r0.mo4812m(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTag(java.lang.Object r2) {
            r1 = this;
            k.a r0 = r1.f15949b
            r0.f15935Y = r2
            return
    }

    @Override // android.view.ActionMode
    public void setTitle(int r2) {
            r1 = this;
            k.a r0 = r1.f15949b
            r0.mo4813n(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            k.a r0 = r1.f15949b
            r0.mo4814o(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean r2) {
            r1 = this;
            k.a r0 = r1.f15949b
            r0.mo4815p(r2)
            return
    }
}
