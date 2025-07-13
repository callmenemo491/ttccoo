package p235n8;

/* renamed from: n8.e */
/* loaded from: classes.dex */
public abstract class AbstractC4698e extends android.widget.FrameLayout {

    /* renamed from: a0 */
    public final p235n8.C4695b f18768a0;

    /* renamed from: b0 */
    public final p235n8.AbstractC4696c f18769b0;

    /* renamed from: c0 */
    public final p235n8.C4697d f18770c0;

    /* renamed from: d0 */
    public android.content.res.ColorStateList f18771d0;

    /* renamed from: e0 */
    public android.view.MenuInflater f18772e0;

    /* renamed from: f0 */
    public p235n8.AbstractC4698e.c f18773f0;

    /* renamed from: g0 */
    public p235n8.AbstractC4698e.b f18774g0;

    /* renamed from: n8.e$a */
    public class a implements androidx.appcompat.view.menu.C0211e.a {

        /* renamed from: Y */
        public final /* synthetic */ p235n8.AbstractC4698e f18775Y;

        public a(p235n8.AbstractC4698e r1) {
                r0 = this;
                r0.f18775Y = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.C0211e.a
        /* renamed from: a */
        public boolean mo523a(androidx.appcompat.view.menu.C0211e r18, android.view.MenuItem r19) {
                r17 = this;
                r0 = r17
                n8.e r1 = r0.f18775Y
                n8.e$b r1 = r1.f18774g0
                r2 = 1
                r3 = 0
                java.lang.String r4 = "$graphIdToTagMap"
                java.lang.String r5 = "$fragmentManager"
                if (r1 == 0) goto L56
                int r1 = r19.getItemId()
                n8.e r6 = r0.f18775Y
                int r6 = r6.getSelectedItemId()
                if (r1 != r6) goto L56
                n8.e r1 = r0.f18775Y
                n8.e$b r1 = r1.f18774g0
                f1.g0 r1 = (p085f1.C1963g0) r1
                java.lang.Object r6 = r1.f8598Z
                s.i r6 = (p319s.C5942i) r6
                java.lang.Object r1 = r1.f8599a0
                androidx.fragment.app.d0 r1 = (androidx.fragment.app.AbstractC0375d0) r1
                p214m2.C4339q.m9706k(r6, r4)
                p214m2.C4339q.m9706k(r1, r5)
                int r4 = r19.getItemId()
                java.lang.Object r4 = r6.m12348d(r4)
                java.lang.String r4 = (java.lang.String) r4
                androidx.fragment.app.n r1 = r1.m1140I(r4)
                java.lang.String r4 = "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment"
                java.util.Objects.requireNonNull(r1, r4)
                androidx.navigation.fragment.NavHostFragment r1 = (androidx.navigation.fragment.NavHostFragment) r1
                androidx.navigation.NavController r1 = r1.m1584E0()
                java.lang.String r4 = "selectedFragment.navController"
                p214m2.C4339q.m9705j(r1, r4)
                androidx.navigation.o r4 = r1.m1565d()
                int r4 = r4.f2985h0
                r1.m1570i(r4, r3)
                return r2
            L56:
                n8.e r1 = r0.f18775Y
                n8.e$c r1 = r1.f18773f0
                if (r1 == 0) goto L133
                vg.k r1 = (vg.C6670k) r1
                androidx.fragment.app.d0 r6 = r1.f25936a
                s.i r7 = r1.f25937b
                nh.q r8 = r1.f25938c
                java.lang.String r9 = r1.f25939d
                nh.n r10 = r1.f25940e
                androidx.lifecycle.d0 r11 = r1.f25941f
                mh.l r1 = r1.f25942g
                p214m2.C4339q.m9706k(r6, r5)
                p214m2.C4339q.m9706k(r7, r4)
                java.lang.String r4 = "$selectedItemTag"
                p214m2.C4339q.m9706k(r8, r4)
                java.lang.String r4 = "$firstFragmentTag"
                p214m2.C4339q.m9706k(r9, r4)
                java.lang.String r4 = "$isOnFirstFragment"
                p214m2.C4339q.m9706k(r10, r4)
                java.lang.String r4 = "$selectedNavController"
                p214m2.C4339q.m9706k(r11, r4)
                java.lang.String r4 = "item"
                r5 = r19
                p214m2.C4339q.m9706k(r5, r4)
                boolean r4 = r6.m1149S()
                if (r4 == 0) goto L95
                goto L12f
            L95:
                int r4 = r19.getItemId()
                java.lang.Object r4 = r7.m12348d(r4)
                java.lang.String r4 = (java.lang.String) r4
                T r12 = r8.f19232Y
                boolean r12 = p214m2.C4339q.m9702c(r12, r4)
                if (r12 != 0) goto L122
                androidx.fragment.app.d0$o r12 = new androidx.fragment.app.d0$o
                r13 = -1
                r12.<init>(r6, r9, r13, r2)
                r6.m1132A(r12, r3)
                androidx.fragment.app.n r12 = r6.m1140I(r4)
                boolean r13 = r12 instanceof androidx.navigation.fragment.NavHostFragment
                if (r13 == 0) goto Lbb
                androidx.navigation.fragment.NavHostFragment r12 = (androidx.navigation.fragment.NavHostFragment) r12
                goto Lbc
            Lbb:
                r12 = 0
            Lbc:
                if (r12 != 0) goto Lbf
                goto L12f
            Lbf:
                boolean r13 = p214m2.C4339q.m9702c(r9, r4)
                if (r13 != 0) goto L104
                androidx.fragment.app.a r13 = new androidx.fragment.app.a
                r13.<init>(r6)
                androidx.fragment.app.m0$a r14 = new androidx.fragment.app.m0$a
                r15 = 7
                r14.<init>(r15, r12)
                r13.m1292c(r14)
                r13.m1087q(r12)
                int r14 = r7.m12352j()
                r15 = 0
            Ldb:
                if (r15 >= r14) goto Lfc
                r7.m12350f(r15)
                java.lang.Object r16 = r7.m12353k(r15)
                r3 = r16
                java.lang.String r3 = (java.lang.String) r3
                boolean r3 = p214m2.C4339q.m9702c(r3, r4)
                if (r3 != 0) goto Lf8
                androidx.fragment.app.n r3 = r6.m1140I(r9)
                p214m2.C4339q.m9704i(r3)
                r13.m1080j(r3)
            Lf8:
                int r15 = r15 + 1
                r3 = 0
                goto Ldb
            Lfc:
                r13.m1293d(r9)
                r13.f2248p = r2
                r13.mo1075e()
            L104:
                r8.f19232Y = r4
                boolean r3 = p214m2.C4339q.m9702c(r4, r9)
                r10.f19229Y = r3
                androidx.navigation.NavController r3 = r12.m1584E0()
                r11.mo7l(r3)
                if (r1 == 0) goto L120
                int r3 = r19.getItemId()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.mo107b(r3)
            L120:
                r1 = 1
                goto L130
            L122:
                if (r1 == 0) goto L12f
                int r3 = r19.getItemId()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.mo107b(r3)
            L12f:
                r1 = 0
            L130:
                if (r1 != 0) goto L133
                goto L134
            L133:
                r2 = 0
            L134:
                return r2
        }

        @Override // androidx.appcompat.view.menu.C0211e.a
        /* renamed from: b */
        public void mo524b(androidx.appcompat.view.menu.C0211e r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: n8.e$b */
    public interface b {
    }

    /* renamed from: n8.e$c */
    public interface c {
    }

    /* renamed from: n8.e$d */
    public static class d extends p320s0.AbstractC5943a {
        public static final android.os.Parcelable.Creator<p235n8.AbstractC4698e.d> CREATOR = null;

        /* renamed from: a0 */
        public android.os.Bundle f18776a0;

        /* renamed from: n8.e$d$a */
        public static class a implements android.os.Parcelable.ClassLoaderCreator<p235n8.AbstractC4698e.d> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    n8.e$d r0 = new n8.e$d
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public p235n8.AbstractC4698e.d createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    n8.e$d r0 = new n8.e$d
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    n8.e$d[] r1 = new p235n8.AbstractC4698e.d[r1]
                    return r1
            }
        }

        static {
                n8.e$d$a r0 = new n8.e$d$a
                r0.<init>()
                p235n8.AbstractC4698e.d.CREATOR = r0
                return
        }

        public d(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 != 0) goto Lb
                java.lang.Class<n8.e$d> r2 = p235n8.AbstractC4698e.d.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
            Lb:
                android.os.Bundle r1 = r1.readBundle(r2)
                r0.f18776a0 = r1
                return
        }

        public d(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p320s0.AbstractC5943a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                android.os.Parcelable r0 = r1.f22819Y
                r2.writeParcelable(r0, r3)
                android.os.Bundle r3 = r1.f18776a0
                r2.writeBundle(r3)
                return
        }
    }

    public AbstractC4698e(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12) {
            r8 = this;
            android.content.Context r9 = p431y8.C7133a.m14245a(r9, r10, r11, r12)
            r8.<init>(r9, r10, r11)
            n8.d r9 = new n8.d
            r9.<init>()
            r8.f18770c0 = r9
            android.content.Context r6 = r8.getContext()
            int[] r2 = p339t7.C6183a.f23992E
            r7 = 2
            int[] r5 = new int[r7]
            r5 = {x0146: FILL_ARRAY_DATA , data: [7, 6} // fill-array
            r0 = r6
            r1 = r10
            r3 = r11
            r4 = r12
            androidx.appcompat.widget.y0 r10 = p220m8.C4429m.m9882e(r0, r1, r2, r3, r4, r5)
            n8.b r11 = new n8.b
            java.lang.Class r12 = r8.getClass()
            int r0 = r8.getMaxItemCount()
            r11.<init>(r6, r12, r0)
            r8.f18768a0 = r11
            z7.b r12 = new z7.b
            r12.<init>(r6)
            r8.f18769b0 = r12
            r9.f18763Y = r12
            r0 = 1
            r9.f18765a0 = r0
            r12.setPresenter(r9)
            android.content.Context r1 = r11.f808a
            r11.m499b(r9, r1)
            r8.getContext()
            n8.c r1 = r9.f18763Y
            r1.f18761s0 = r11
            r1 = 4
            boolean r2 = r10.m864p(r1)
            if (r2 == 0) goto L58
            android.content.res.ColorStateList r1 = r10.m851c(r1)
            goto L5f
        L58:
            r1 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r1 = r12.m10743c(r1)
        L5f:
            r12.setIconTintList(r1)
            r1 = 3
            android.content.res.Resources r2 = r8.getResources()
            r3 = 2131165594(0x7f07019a, float:1.794541E38)
            int r2 = r2.getDimensionPixelSize(r3)
            int r1 = r10.m854f(r1, r2)
            r8.setItemIconSize(r1)
            r1 = 7
            boolean r2 = r10.m864p(r1)
            r3 = 0
            if (r2 == 0) goto L84
            int r1 = r10.m861m(r1, r3)
            r8.setItemTextAppearanceInactive(r1)
        L84:
            r1 = 6
            boolean r2 = r10.m864p(r1)
            if (r2 == 0) goto L92
            int r1 = r10.m861m(r1, r3)
            r8.setItemTextAppearanceActive(r1)
        L92:
            r1 = 8
            boolean r2 = r10.m864p(r1)
            if (r2 == 0) goto La1
            android.content.res.ColorStateList r1 = r10.m851c(r1)
            r8.setItemTextColor(r1)
        La1:
            android.graphics.drawable.Drawable r1 = r8.getBackground()
            if (r1 == 0) goto Laf
            android.graphics.drawable.Drawable r1 = r8.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto Lda
        Laf:
            t8.f r1 = new t8.f
            r1.<init>()
            android.graphics.drawable.Drawable r2 = r8.getBackground()
            boolean r4 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r4 == 0) goto Lc9
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.m12773q(r2)
        Lc9:
            t8.f$b r2 = r1.f24036Y
            j8.a r4 = new j8.a
            r4.<init>(r6)
            r2.f24060b = r4
            r1.m12781y()
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r8, r1)
        Lda:
            boolean r1 = r10.m864p(r0)
            if (r1 == 0) goto Le8
            int r1 = r10.m854f(r0, r3)
            float r1 = (float) r1
            r8.setElevation(r1)
        Le8:
            android.content.res.ColorStateList r1 = p288q8.C5599c.m11876b(r6, r10, r3)
            android.graphics.drawable.Drawable r2 = r8.getBackground()
            android.graphics.drawable.Drawable r2 = r2.mutate()
            r2.setTintList(r1)
            r1 = 9
            r2 = -1
            int r1 = r10.m859k(r1, r2)
            r8.setLabelVisibilityMode(r1)
            int r1 = r10.m861m(r7, r3)
            if (r1 == 0) goto L10b
            r12.setItemBackgroundRes(r1)
            goto L113
        L10b:
            r1 = 5
            android.content.res.ColorStateList r1 = p288q8.C5599c.m11876b(r6, r10, r1)
            r8.setItemRippleColor(r1)
        L113:
            r1 = 10
            boolean r2 = r10.m864p(r1)
            if (r2 == 0) goto L12d
            int r1 = r10.m861m(r1, r3)
            r9.f18764Z = r0
            android.view.MenuInflater r2 = r8.getMenuInflater()
            r2.inflate(r1, r11)
            r9.f18764Z = r3
            r9.mo487v(r0)
        L12d:
            android.content.res.TypedArray r9 = r10.f1501b
            r9.recycle()
            r8.addView(r12)
            n8.e$a r9 = new n8.e$a
            r9.<init>(r8)
            r11.f812e = r9
            n8.f r9 = new n8.f
            r9.<init>(r8)
            p220m8.C4430n.m9883a(r8, r9)
            return
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            android.view.MenuInflater r0 = r2.f18772e0
            if (r0 != 0) goto Lf
            k.f r0 = new k.f
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.f18772e0 = r0
        Lf:
            android.view.MenuInflater r0 = r2.f18772e0
            return r0
    }

    public android.graphics.drawable.Drawable getItemBackground() {
            r1 = this;
            n8.c r0 = r1.f18769b0
            android.graphics.drawable.Drawable r0 = r0.getItemBackground()
            return r0
    }

    @java.lang.Deprecated
    public int getItemBackgroundResource() {
            r1 = this;
            n8.c r0 = r1.f18769b0
            int r0 = r0.getItemBackgroundRes()
            return r0
    }

    public int getItemIconSize() {
            r1 = this;
            n8.c r0 = r1.f18769b0
            int r0 = r0.getItemIconSize()
            return r0
    }

    public android.content.res.ColorStateList getItemIconTintList() {
            r1 = this;
            n8.c r0 = r1.f18769b0
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    public android.content.res.ColorStateList getItemRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f18771d0
            return r0
    }

    public int getItemTextAppearanceActive() {
            r1 = this;
            n8.c r0 = r1.f18769b0
            int r0 = r0.getItemTextAppearanceActive()
            return r0
    }

    public int getItemTextAppearanceInactive() {
            r1 = this;
            n8.c r0 = r1.f18769b0
            int r0 = r0.getItemTextAppearanceInactive()
            return r0
    }

    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            n8.c r0 = r1.f18769b0
            android.content.res.ColorStateList r0 = r0.getItemTextColor()
            return r0
    }

    public int getLabelVisibilityMode() {
            r1 = this;
            n8.c r0 = r1.f18769b0
            int r0 = r0.getLabelVisibilityMode()
            return r0
    }

    public abstract int getMaxItemCount();

    public android.view.Menu getMenu() {
            r1 = this;
            n8.b r0 = r1.f18768a0
            return r0
    }

    public androidx.appcompat.view.menu.InterfaceC0216j getMenuView() {
            r1 = this;
            n8.c r0 = r1.f18769b0
            return r0
    }

    public p235n8.C4697d getPresenter() {
            r1 = this;
            n8.d r0 = r1.f18770c0
            return r0
    }

    public int getSelectedItemId() {
            r1 = this;
            n8.c r0 = r1.f18769b0
            int r0 = r0.getSelectedItemId()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof p340t8.C6189f
            if (r1 == 0) goto L10
            t8.f r0 = (p340t8.C6189f) r0
            p185k7.C3828h5.m8575D(r2, r0)
        L10:
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r5) {
            r4 = this;
            boolean r0 = r5 instanceof p235n8.AbstractC4698e.d
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r5)
            return
        L8:
            n8.e$d r5 = (p235n8.AbstractC4698e.d) r5
            android.os.Parcelable r0 = r5.f22819Y
            super.onRestoreInstanceState(r0)
            n8.b r0 = r4.f18768a0
            android.os.Bundle r5 = r5.f18776a0
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "android:menu:presenters"
            android.util.SparseArray r5 = r5.getSparseParcelableArray(r1)
            if (r5 == 0) goto L59
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r1 = r0.f828u
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L27
            goto L59
        L27:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r1 = r0.f828u
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.i r3 = (androidx.appcompat.view.menu.InterfaceC0215i) r3
            if (r3 != 0) goto L47
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r3 = r0.f828u
            r3.remove(r2)
            goto L2d
        L47:
            int r2 = r3.mo469r()
            if (r2 <= 0) goto L2d
            java.lang.Object r2 = r5.get(r2)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            if (r2 == 0) goto L2d
            r3.mo485t(r2)
            goto L2d
        L59:
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r7 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            n8.e$d r1 = new n8.e$d
            r1.<init>(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.f18776a0 = r0
            n8.b r2 = r7.f18768a0
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r3 = r2.f828u
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1b
            goto L55
        L1b:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r4 = r2.f828u
            java.util.Iterator r4 = r4.iterator()
        L26:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.next()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r6 = r5.get()
            androidx.appcompat.view.menu.i r6 = (androidx.appcompat.view.menu.InterfaceC0215i) r6
            if (r6 != 0) goto L40
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r6 = r2.f828u
            r6.remove(r5)
            goto L26
        L40:
            int r5 = r6.mo469r()
            if (r5 <= 0) goto L26
            android.os.Parcelable r6 = r6.mo489x()
            if (r6 == 0) goto L26
            r3.put(r5, r6)
            goto L26
        L50:
            java.lang.String r2 = "android:menu:presenters"
            r0.putSparseParcelableArray(r2, r3)
        L55:
            return r1
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            p185k7.C3828h5.m8574C(r0, r1)
            return
    }

    public void setItemBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            n8.c r0 = r1.f18769b0
            r0.setItemBackground(r2)
            r2 = 0
            r1.f18771d0 = r2
            return
    }

    public void setItemBackgroundResource(int r2) {
            r1 = this;
            n8.c r0 = r1.f18769b0
            r0.setItemBackgroundRes(r2)
            r2 = 0
            r1.f18771d0 = r2
            return
    }

    public void setItemIconSize(int r2) {
            r1 = this;
            n8.c r0 = r1.f18769b0
            r0.setItemIconSize(r2)
            return
    }

    public void setItemIconSizeRes(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setItemIconSize(r2)
            return
    }

    public void setItemIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            n8.c r0 = r1.f18769b0
            r0.setIconTintList(r2)
            return
    }

    public void setItemRippleColor(android.content.res.ColorStateList r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f18771d0
            r1 = 0
            if (r0 != r4) goto L15
            if (r4 != 0) goto L14
            n8.c r4 = r3.f18769b0
            android.graphics.drawable.Drawable r4 = r4.getItemBackground()
            if (r4 == 0) goto L14
            n8.c r4 = r3.f18769b0
            r4.setItemBackground(r1)
        L14:
            return
        L15:
            r3.f18771d0 = r4
            if (r4 != 0) goto L1f
            n8.c r4 = r3.f18769b0
            r4.setItemBackground(r1)
            goto L2d
        L1f:
            android.content.res.ColorStateList r4 = p308r8.C5799a.m12169a(r4)
            n8.c r0 = r3.f18769b0
            android.graphics.drawable.RippleDrawable r2 = new android.graphics.drawable.RippleDrawable
            r2.<init>(r4, r1, r1)
            r0.setItemBackground(r2)
        L2d:
            return
    }

    public void setItemTextAppearanceActive(int r2) {
            r1 = this;
            n8.c r0 = r1.f18769b0
            r0.setItemTextAppearanceActive(r2)
            return
    }

    public void setItemTextAppearanceInactive(int r2) {
            r1 = this;
            n8.c r0 = r1.f18769b0
            r0.setItemTextAppearanceInactive(r2)
            return
    }

    public void setItemTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            n8.c r0 = r1.f18769b0
            r0.setItemTextColor(r2)
            return
    }

    public void setLabelVisibilityMode(int r2) {
            r1 = this;
            n8.c r0 = r1.f18769b0
            int r0 = r0.getLabelVisibilityMode()
            if (r0 == r2) goto L13
            n8.c r0 = r1.f18769b0
            r0.setLabelVisibilityMode(r2)
            n8.d r2 = r1.f18770c0
            r0 = 0
            r2.mo487v(r0)
        L13:
            return
    }

    public void setOnItemReselectedListener(p235n8.AbstractC4698e.b r1) {
            r0 = this;
            r0.f18774g0 = r1
            return
    }

    public void setOnItemSelectedListener(p235n8.AbstractC4698e.c r1) {
            r0 = this;
            r0.f18773f0 = r1
            return
    }

    public void setSelectedItemId(int r4) {
            r3 = this;
            n8.b r0 = r3.f18768a0
            android.view.MenuItem r4 = r0.findItem(r4)
            if (r4 == 0) goto L17
            n8.b r0 = r3.f18768a0
            n8.d r1 = r3.f18770c0
            r2 = 0
            boolean r0 = r0.m515r(r4, r1, r2)
            if (r0 != 0) goto L17
            r0 = 1
            r4.setChecked(r0)
        L17:
            return
    }
}
