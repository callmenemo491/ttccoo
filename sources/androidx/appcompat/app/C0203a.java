package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public class C0203a implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: Y */
    public final /* synthetic */ androidx.appcompat.app.AlertController f712Y;

    /* renamed from: Z */
    public final /* synthetic */ androidx.appcompat.app.AlertController.C0200b f713Z;

    public C0203a(androidx.appcompat.app.AlertController.C0200b r1, androidx.appcompat.app.AlertController r2) {
            r0 = this;
            r0.f713Z = r1
            r0.f712Y = r2
            r0.<init>()
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.app.AlertController$b r1 = r0.f713Z
            android.content.DialogInterface$OnClickListener r1 = r1.f707m
            androidx.appcompat.app.AlertController r2 = r0.f712Y
            f.p r2 = r2.f667b
            r1.onClick(r2, r3)
            androidx.appcompat.app.AlertController$b r1 = r0.f713Z
            boolean r1 = r1.f709o
            if (r1 != 0) goto L18
            androidx.appcompat.app.AlertController r1 = r0.f712Y
            f.p r1 = r1.f667b
            r1.dismiss()
        L18:
            return
    }
}
