package p116h;

@android.annotation.SuppressLint({"RestrictedAPI"})
/* renamed from: h.e */
/* loaded from: classes.dex */
public class C2434e extends p116h.C2432c {

    /* renamed from: l0 */
    public p116h.C2434e.a f10866l0;

    /* renamed from: m0 */
    public boolean f10867m0;

    /* renamed from: h.e$a */
    public static class a extends p116h.C2432c.c {

        /* renamed from: J */
        public int[][] f10868J;

        public a(p116h.C2434e.a r1, p116h.C2434e r2, android.content.res.Resources r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                if (r1 == 0) goto La
                int[][] r1 = r1.f10868J
                r0.f10868J = r1
                goto L11
            La:
                android.graphics.drawable.Drawable[] r1 = r0.f10845g
                int r1 = r1.length
                int[][] r1 = new int[r1][]
                r0.f10868J = r1
            L11:
                return
        }

        @Override // p116h.C2432c.c
        /* renamed from: e */
        public void mo6163e() {
                r4 = this;
                int[][] r0 = r4.f10868J
                int r1 = r0.length
                int[][] r1 = new int[r1][]
                int r0 = r0.length
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L1f
                int[][] r2 = r4.f10868J
                r3 = r2[r0]
                if (r3 == 0) goto L19
                r2 = r2[r0]
                java.lang.Object r2 = r2.clone()
                int[] r2 = (int[]) r2
                goto L1a
            L19:
                r2 = 0
            L1a:
                r1[r0] = r2
                int r0 = r0 + (-1)
                goto L8
            L1f:
                r4.f10868J = r1
                return
        }

        /* renamed from: g */
        public int m6175g(int[] r5) {
                r4 = this;
                int[][] r0 = r4.f10868J
                int r1 = r4.f10846h
                r2 = 0
            L5:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                boolean r3 = android.util.StateSet.stateSetMatches(r3, r5)
                if (r3 == 0) goto L10
                return r2
            L10:
                int r2 = r2 + 1
                goto L5
            L13:
                r5 = -1
                return r5
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                h.e r0 = new h.e
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                h.e r0 = new h.e
                r0.<init>(r1, r2)
                return r0
        }
    }

    public C2434e(p116h.C2434e.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public C2434e(p116h.C2434e.a r2, android.content.res.Resources r3) {
            r1 = this;
            r1.<init>()
            h.e$a r0 = new h.e$a
            r0.<init>(r2, r1, r3)
            r1.mo6158e(r0)
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
            return
    }

    @Override // p116h.C2432c, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r1) {
            r0 = this;
            super.applyTheme(r1)
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
            return
    }

    @Override // p116h.C2432c
    /* renamed from: b */
    public /* bridge */ /* synthetic */ p116h.C2432c.c mo6157b() {
            r1 = this;
            h.e$a r0 = r1.mo6159f()
            return r0
    }

    @Override // p116h.C2432c
    /* renamed from: e */
    public void mo6158e(p116h.C2432c.c r2) {
            r1 = this;
            r1.f10816Y = r2
            int r0 = r1.f10822e0
            if (r0 < 0) goto L11
            android.graphics.drawable.Drawable r0 = r2.m6173d(r0)
            r1.f10818a0 = r0
            if (r0 == 0) goto L11
            r1.m6168c(r0)
        L11:
            r0 = 0
            r1.f10819b0 = r0
            boolean r0 = r2 instanceof p116h.C2434e.a
            if (r0 == 0) goto L1c
            h.e$a r2 = (p116h.C2434e.a) r2
            r1.f10866l0 = r2
        L1c:
            return
    }

    /* renamed from: f */
    public p116h.C2434e.a mo6159f() {
            r3 = this;
            h.e$a r0 = new h.e$a
            h.e$a r1 = r3.f10866l0
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p116h.C2432c, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.f10867m0
            if (r0 != 0) goto Lf
            super.mutate()
            h.e$a r0 = r1.f10866l0
            r0.mo6163e()
            r0 = 1
            r1.f10867m0 = r0
        Lf:
            return r1
    }

    @Override // p116h.C2432c, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r3) {
            r2 = this;
            boolean r0 = super.onStateChange(r3)
            h.e$a r1 = r2.f10866l0
            int r3 = r1.m6175g(r3)
            if (r3 >= 0) goto L14
            h.e$a r3 = r2.f10866l0
            int[] r1 = android.util.StateSet.WILD_CARD
            int r3 = r3.m6175g(r1)
        L14:
            boolean r3 = r2.m6169d(r3)
            if (r3 != 0) goto L1f
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r3 = 0
            goto L20
        L1f:
            r3 = 1
        L20:
            return r3
    }
}
