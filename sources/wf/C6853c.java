package wf;

/* renamed from: wf.c */
/* loaded from: classes.dex */
public final class C6853c extends wf.AbstractC6857e<p171jd.C3528k0> {
    public C6853c(p171jd.C3528k0 r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // wf.AbstractC6857e
    /* renamed from: x */
    public void mo13917x(io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI r7) {
            r6 = this;
            java.lang.String r0 = "item"
            p214m2.C4339q.m9706k(r7, r0)
            B extends w1.a r0 = r6.f26611u
            jd.k0 r0 = (p171jd.C3528k0) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15274e
            java.lang.String r2 = "imageView"
            p214m2.C4339q.m9705j(r1, r2)
            java.lang.String r2 = r7.f14482b0
            java.lang.String r2 = p074e9.C1805a.m4526k(r2)
            java.lang.String r3 = r7.f14483c0
            java.lang.String r3 = p074e9.C1805a.m4526k(r3)
            h7.of r4 = new h7.of
            r4.<init>(r1, r2, r3)
            r1 = 185(0xb9, float:2.59E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r3 = 2
            p124h7.C2789of.m7024d(r4, r1, r2, r3)
            r4.m7026c()
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15275f
            r4 = 35
            java.lang.StringBuilder r4 = p367v1.C6487a.m13176a(r4)
            java.lang.String r5 = r7.f14485e0
            p238nd.C4788z.m10841a(r4, r5, r1)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15276g
            java.lang.String r4 = r7.f14481a0
            r1.setText(r4)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15271b
            java.lang.String r4 = r7.f14484d0
            r1.setText(r4)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15277h
            java.lang.String r4 = r7.f14487g0
            r1.setText(r4)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15272c
            java.lang.String r4 = r7.f14488h0
            r1.setText(r4)
            java.lang.Integer r1 = r7.f14486f0
            r4 = 3
            if (r1 != 0) goto L5e
            goto L68
        L5e:
            int r5 = r1.intValue()
            if (r5 != r4) goto L68
            r1 = 2131231023(0x7f08012f, float:1.8078115E38)
            goto L74
        L68:
            if (r1 != 0) goto L6b
            goto L78
        L6b:
            int r1 = r1.intValue()
            if (r1 != r3) goto L78
            r1 = 2131231024(0x7f080130, float:1.8078117E38)
        L74:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L78:
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15271b
            java.lang.String r3 = "collectionName"
            p214m2.C4339q.m9705j(r1, r3)
            java.lang.Integer r7 = r7.f14486f0
            if (r7 != 0) goto L84
            goto L8e
        L84:
            int r7 = r7.intValue()
            if (r7 != r4) goto L8e
            r7 = 2131099745(0x7f060061, float:1.7811852E38)
            goto L91
        L8e:
            r7 = 2131099746(0x7f060062, float:1.7811854E38)
        L91:
            vg.C6664e.m13510k(r1, r7)
            androidx.appcompat.widget.AppCompatImageView r7 = r0.f15273d
            java.lang.String r1 = "iconVerified"
            p214m2.C4339q.m9705j(r7, r1)
            r1 = 0
            if (r2 == 0) goto La0
            r3 = 1
            goto La1
        La0:
            r3 = 0
        La1:
            if (r3 == 0) goto La4
            goto La6
        La4:
            r1 = 8
        La6:
            r7.setVisibility(r1)
            if (r2 == 0) goto Lb4
            int r7 = r2.intValue()
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f15273d
            r0.setImageResource(r7)
        Lb4:
            return
    }
}
