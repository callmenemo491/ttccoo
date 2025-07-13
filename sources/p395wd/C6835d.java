package p395wd;

/* renamed from: wd.d */
/* loaded from: classes.dex */
public final class C6835d extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<p395wd.C6833b.a, java.lang.Integer, p255od.C5235w, ch.C0985l> {

    /* renamed from: Z */
    public static final p395wd.C6835d f26590Z = null;

    static {
            wd.d r0 = new wd.d
            r0.<init>()
            p395wd.C6835d.f26590Z = r0
            return
    }

    public C6835d() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(p395wd.C6833b.a r13, java.lang.Integer r14, p255od.C5235w r15) {
            r12 = this;
            wd.b$a r13 = (p395wd.C6833b.a) r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            od.w r15 = (p255od.C5235w) r15
            java.lang.String r0 = "$this$onBind"
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "item"
            p214m2.C4339q.m9706k(r15, r0)
            p214m2.C4339q.m9706k(r15, r0)
            jd.e0 r0 = r13.f26582u
            wd.b r13 = r13.f26583v
            od.u r1 = r15.getIngredient()
            od.q0 r1 = r1.getTemplate()
            od.t r1 = r1.getImmutable_data()
            od.f0 r1 = r1.getRarity()
            androidx.appcompat.widget.AppCompatTextView r2 = r0.f15110f
            r3 = 120(0x78, float:1.68E-43)
            java.lang.StringBuilder r3 = p367v1.C6487a.m13176a(r3)
            int r4 = r15.getCount()
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            r5 = 1
            r6 = 0
            if (r1 == 0) goto Lb2
            java.lang.String r7 = r1.getValue()
            if (r7 == 0) goto Lb2
            java.lang.String r8 = "<this>"
            p214m2.C4339q.m9706k(r7, r8)
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r10 = "getDefault()"
            p214m2.C4339q.m9705j(r9, r10)
            p214m2.C4339q.m9706k(r7, r8)
            java.lang.String r8 = "locale"
            p214m2.C4339q.m9706k(r9, r8)
            int r8 = r7.length()
            if (r8 <= 0) goto L67
            r8 = 1
            goto L68
        L67:
            r8 = 0
        L68:
            if (r8 == 0) goto Lb3
            char r8 = r7.charAt(r6)
            boolean r10 = java.lang.Character.isLowerCase(r8)
            if (r10 == 0) goto Lb3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            char r11 = java.lang.Character.toTitleCase(r8)
            char r8 = java.lang.Character.toUpperCase(r8)
            if (r11 == r8) goto L87
            r10.append(r11)
            goto L9c
        L87:
            java.lang.String r8 = r7.substring(r6, r5)
            java.lang.String r11 = "this as java.lang.String\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r8, r11)
            java.lang.String r8 = r8.toUpperCase(r9)
            java.lang.String r9 = "this as java.lang.String).toUpperCase(locale)"
            p214m2.C4339q.m9705j(r8, r9)
            r10.append(r8)
        L9c:
            java.lang.String r7 = r7.substring(r5)
            java.lang.String r8 = "this as java.lang.String).substring(startIndex)"
            p214m2.C4339q.m9705j(r7, r8)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            java.lang.String r8 = "StringBuilder().apply(builderAction).toString()"
            p214m2.C4339q.m9705j(r7, r8)
            goto Lb3
        Lb2:
            r7 = 0
        Lb3:
            if (r7 != 0) goto Lb7
            java.lang.String r7 = ""
        Lb7:
            r3.append(r7)
            r3.append(r4)
            od.u r4 = r15.getIngredient()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            java.lang.Object r2 = r0.f15109e
            androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
            java.lang.String r3 = "imageView"
            p214m2.C4339q.m9705j(r2, r3)
            od.u r3 = r15.getIngredient()
            java.lang.String r3 = r3.getImage()
            vg.C6672m.m13521h(r2, r3)
            androidx.appcompat.widget.AppCompatTextView r2 = r0.f15107c
            int r3 = r15.getSelected()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.setText(r3)
            com.google.android.material.button.MaterialButton r2 = r0.f15108d
            java.lang.String r3 = "Trade for "
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            int r4 = r15.getSelected()
            if (r1 == 0) goto L103
            int r1 = r1.getTacoValue()
            goto L104
        L103:
            r1 = 0
        L104:
            int r4 = r4 * r1
            r3.append(r4)
            java.lang.String r1 = " TACO"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.setText(r1)
            java.lang.Object r1 = r0.f15111g
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            wd.a r2 = new wd.a
            r2.<init>(r15, r13, r14, r6)
            r1.setOnClickListener(r2)
            java.lang.Object r0 = r0.f15112h
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            wd.a r1 = new wd.a
            r1.<init>(r15, r13, r14, r5)
            r0.setOnClickListener(r1)
            ch.l r13 = ch.C0985l.f5061a
            return r13
    }
}
