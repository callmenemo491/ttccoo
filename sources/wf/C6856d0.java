package wf;

/* renamed from: wf.d0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C6856d0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: Y */
    public final /* synthetic */ int f26609Y;

    /* renamed from: Z */
    public final /* synthetic */ androidx.appcompat.widget.C0284j0 f26610Z;

    public /* synthetic */ C6856d0(androidx.appcompat.widget.C0284j0 r1, int r2) {
            r0 = this;
            r0.f26609Y = r2
            r0.<init>()
            r0.f26610Z = r1
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            int r1 = r0.f26609Y
            r4 = 0
            java.lang.String r5 = "$popupWindow"
            switch(r1) {
                case 0: goto L9;
                default: goto L8;
            }
        L8:
            goto L29
        L9:
            androidx.appcompat.widget.j0 r1 = r0.f26610Z
            p214m2.C4339q.m9706k(r1, r5)
            java.util.List<wf.f> r2 = wf.C6858e0.f26612a
            if (r2 == 0) goto L21
            java.lang.Object r2 = r2.get(r3)
            wf.f r2 = (wf.C6859f) r2
            if (r2 == 0) goto L21
            mh.l<? super wf.f, ch.l> r3 = wf.C6858e0.f26613b
            if (r3 == 0) goto L21
            r3.mo107b(r2)
        L21:
            r1.dismiss()
            wf.C6858e0.f26612a = r4
            wf.C6858e0.f26613b = r4
            return
        L29:
            androidx.appcompat.widget.j0 r1 = r0.f26610Z
            p214m2.C4339q.m9706k(r1, r5)
            r5 = 2131362671(0x7f0a036f, float:1.834513E38)
            android.view.View r2 = r2.findViewById(r5)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L44
            java.lang.CharSequence r2 = r2.getText()
            if (r2 == 0) goto L44
            java.lang.String r2 = r2.toString()
            goto L45
        L44:
            r2 = r4
        L45:
            if (r2 != 0) goto L49
            java.lang.String r2 = ""
        L49:
            java.util.List<od.b0> r5 = p315rg.C5847c.f22620a
            if (r5 == 0) goto L54
            java.lang.Object r3 = r5.get(r3)
            od.b0 r3 = (p255od.C5194b0) r3
            goto L55
        L54:
            r3 = r4
        L55:
            if (r3 == 0) goto L5c
            java.lang.String r5 = r3.getCurrency()
            goto L5d
        L5c:
            r5 = r4
        L5d:
            boolean r2 = p214m2.C4339q.m9702c(r5, r2)
            if (r2 == 0) goto L6a
            mh.l<? super od.b0, ch.l> r2 = p315rg.C5847c.f22621b
            if (r2 == 0) goto L6a
            r2.mo107b(r3)
        L6a:
            r1.dismiss()
            p315rg.C5847c.f22620a = r4
            p315rg.C5847c.f22621b = r4
            return
    }
}
