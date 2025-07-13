package p124h7;

/* renamed from: h7.of */
/* loaded from: classes.dex */
public final class C2789of implements p124h7.InterfaceC2534ad {

    /* renamed from: Y */
    public java.lang.String f11811Y;

    /* renamed from: Z */
    public java.lang.String f11812Z;

    /* renamed from: a0 */
    public java.lang.Object f11813a0;

    /* renamed from: b0 */
    public java.lang.Object f11814b0;

    /* renamed from: c0 */
    public java.lang.Object f11815c0;

    /* renamed from: d0 */
    public boolean f11816d0;

    public C2789of() {
            r0 = this;
            r0.<init>()
            return
    }

    public C2789of(android.widget.ImageView r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f11813a0 = r1
            r0.f11811Y = r2
            r0.f11812Z = r3
            r1 = 1
            r0.f11816d0 = r1
            return
    }

    /* renamed from: d */
    public static p124h7.C2789of m7024d(p124h7.C2789of r0, java.lang.Integer r1, java.lang.Integer r2, int r3) {
            r2 = r3 & 1
            r3 = 0
            if (r2 == 0) goto L6
            r1 = r3
        L6:
            if (r1 != 0) goto L9
            goto La
        L9:
            r3 = r1
        La:
            r0.f11815c0 = r3
            return r0
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public java.lang.String mo27a() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.Object r1 = r3.f11814b0
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1d
            java.lang.String r1 = r3.f11811Y
            java.lang.String r2 = "phoneNumber"
            r0.put(r2, r1)
            java.lang.Object r1 = r3.f11814b0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "temporaryProof"
            goto L2a
        L1d:
            java.lang.String r1 = r3.f11812Z
            java.lang.String r2 = "sessionInfo"
            r0.put(r2, r1)
            java.lang.Object r1 = r3.f11813a0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "code"
        L2a:
            r0.put(r2, r1)
            java.lang.Object r1 = r3.f11815c0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L38
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L38:
            boolean r1 = r3.f11816d0
            if (r1 != 0) goto L42
            r1 = 2
            java.lang.String r2 = "operation"
            r0.put(r2, r1)
        L42:
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: b */
    public p301r1.C5764d m7025b() {
            r4 = this;
            boolean r0 = r4.f11816d0
            if (r0 == 0) goto L2d
            r1.d r0 = new r1.d
            java.lang.Object r1 = r4.f11813a0
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            r0.m12080d(r1)
            r1 = 1098907648(0x41800000, float:16.0)
            r1.d$a r2 = r0.f22190Y
            r2.f22212q = r1
            r0.invalidateSelf()
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            r3 = -1
            r1[r2] = r3
            r0.m12078b(r1)
            r0.start()
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
    }

    /* renamed from: c */
    public void m7026c() {
            r4 = this;
            java.lang.Object r0 = r4.f11813a0
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            ld.c r0 = p185k7.C3836i.m8631p(r0)
            java.lang.String r1 = r4.f11811Y
            java.lang.String r2 = ""
            if (r1 == 0) goto L19
            com.bumptech.glide.i r0 = r0.mo2766o()
            com.bumptech.glide.i r0 = r0.mo2758U(r1)
            ld.b r0 = (p205ld.C4265b) r0
            goto L3b
        L19:
            java.lang.String r1 = r4.f11812Z
            if (r1 == 0) goto L2f
            ld.f r3 = new ld.f
            r3.<init>(r1)
            com.bumptech.glide.i r0 = r0.mo2766o()
            ld.b r0 = (p205ld.C4265b) r0
            com.bumptech.glide.i r0 = r0.m2759V(r3)
            ld.b r0 = (p205ld.C4265b) r0
            goto L3b
        L2f:
            com.bumptech.glide.i r0 = r0.mo2766o()
            ld.b r0 = (p205ld.C4265b) r0
            com.bumptech.glide.i r0 = r0.m2759V(r2)
            ld.b r0 = (p205ld.C4265b) r0
        L3b:
            ld.b r0 = r0.m9575c0()
            r1 = 20000(0x4e20, float:2.8026E-41)
            ld.b r0 = r0.m9581i0(r1)
            java.lang.Object r1 = r4.f11814b0
            mh.l r1 = (mh.InterfaceC4620l) r1
            if (r1 == 0) goto L59
            p214m2.C4339q.m9705j(r0, r2)
            java.lang.Object r1 = r1.mo107b(r0)
            ld.b r1 = (p205ld.C4265b) r1
            if (r1 != 0) goto L57
            goto L59
        L57:
            r0 = r1
            goto L5e
        L59:
            java.lang.String r1 = "this"
            p214m2.C4339q.m9705j(r0, r1)
        L5e:
            java.lang.Object r1 = r4.f11815c0
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L6f
            int r1 = r1.intValue()
            c3.a r1 = r0.mo2545u(r1, r1)
            ld.b r1 = (p205ld.C4265b) r1
            goto L70
        L6f:
            r1 = 0
        L70:
            if (r1 != 0) goto L73
            goto L74
        L73:
            r0 = r1
        L74:
            r1.d r1 = r4.m7025b()
            if (r1 == 0) goto L82
            ld.b r1 = r0.m9579g0(r1)
            if (r1 != 0) goto L81
            goto L82
        L81:
            r0 = r1
        L82:
            r1 = 17170445(0x106000d, float:2.461195E-38)
            ld.b r0 = r0.m9574b0(r1)
            java.lang.Object r1 = r4.f11813a0
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.m2753O(r1)
            return
    }
}
