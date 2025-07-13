package re;

/* renamed from: re.f */
/* loaded from: classes.dex */
public final class C5822f extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<re.C5818b.a, java.lang.Integer, p344te.C6223e, ch.C0985l> {

    /* renamed from: Z */
    public static final re.C5822f f22558Z = null;

    static {
            re.f r0 = new re.f
            r0.<init>()
            re.C5822f.f22558Z = r0
            return
    }

    public C5822f() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(re.C5818b.a r8, java.lang.Integer r9, p344te.C6223e r10) {
            r7 = this;
            re.b$a r8 = (re.C5818b.a) r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            te.e r10 = (p344te.C6223e) r10
            java.lang.String r9 = "$this$onBind"
            p214m2.C4339q.m9706k(r8, r9)
            java.lang.String r9 = "item"
            p214m2.C4339q.m9706k(r10, r9)
            p214m2.C4339q.m9706k(r10, r9)
            jd.e0 r8 = r8.f22546u
            androidx.appcompat.widget.AppCompatTextView r9 = r8.f15110f
            java.lang.String r0 = r10.getListingName()
            r9.setText(r0)
            java.util.List r9 = r10.getAssets()
            java.lang.Object r9 = p062dh.C1473i.m3996H(r9)
            te.a r9 = (p344te.C6219a) r9
            java.lang.Object r0 = r8.f15109e
            r1 = r0
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            java.lang.String r0 = "imageView"
            p214m2.C4339q.m9705j(r1, r0)
            r0 = 0
            if (r9 == 0) goto L3d
            java.lang.String r2 = r9.getImageURL()
            goto L3e
        L3d:
            r2 = r0
        L3e:
            if (r9 == 0) goto L46
            java.lang.String r9 = r9.getVideoURL()
            r3 = r9
            goto L47
        L46:
            r3 = r0
        L47:
            r4 = 0
            r5 = 0
            r6 = 12
            vg.C6672m.m13523j(r1, r2, r3, r4, r5, r6)
            java.lang.Object r9 = r8.f15112h
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            te.f r1 = r10.getPrice()
            java.lang.String r1 = r1.getAmountString()
            r0.append(r1)
            java.lang.String r1 = " WAX"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.setText(r0)
            androidx.appcompat.widget.AppCompatTextView r8 = r8.f15107c
            java.lang.String r9 = r10.getValueDollarString()
            r8.setText(r9)
            ch.l r8 = ch.C0985l.f5061a
            return r8
    }
}
