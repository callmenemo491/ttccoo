package p347u0;

/* renamed from: u0.b */
/* loaded from: classes.dex */
public class C6278b implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    public final /* synthetic */ p347u0.InterfaceC6279c f24434a;

    /* renamed from: b */
    public final /* synthetic */ androidx.databinding.InterfaceC0360g f24435b;

    /* renamed from: c */
    public final /* synthetic */ p347u0.InterfaceC6280d f24436c;

    /* renamed from: d */
    public final /* synthetic */ p347u0.InterfaceC6281e f24437d;

    public C6278b(p347u0.InterfaceC6279c r1, androidx.databinding.InterfaceC0360g r2, p347u0.InterfaceC6280d r3, p347u0.InterfaceC6281e r4) {
            r0 = this;
            r0.f24434a = r1
            r0.f24435b = r2
            r0.f24436c = r3
            r0.f24437d = r4
            r0.<init>()
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar r2, int r3, boolean r4) {
            r1 = this;
            u0.c r4 = r1.f24434a
            if (r4 == 0) goto L13
            jd.w$a r4 = (p171jd.C3567w.a) r4
            ve.c r4 = r4.f15602a
            java.util.Objects.requireNonNull(r4)
            java.lang.String r0 = "seekBar"
            p214m2.C4339q.m9706k(r2, r0)
            r4.m13499d(r3)
        L13:
            androidx.databinding.g r2 = r1.f24435b
            if (r2 == 0) goto L1a
            r2.mo1070a()
        L1a:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar r2) {
            r1 = this;
            u0.d r0 = r1.f24436c
            if (r0 == 0) goto L7
            r0.onStartTrackingTouch(r2)
        L7:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar r2) {
            r1 = this;
            u0.e r0 = r1.f24437d
            if (r0 == 0) goto L7
            r0.onStopTrackingTouch(r2)
        L7:
            return
    }
}
