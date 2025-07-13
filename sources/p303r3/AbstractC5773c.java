package p303r3;

/* renamed from: r3.c */
/* loaded from: classes.dex */
public abstract class AbstractC5773c extends p366v0.AbstractC6484c {

    /* renamed from: b */
    public p141i3.C3066a f22254b;

    /* renamed from: c */
    public android.graphics.Paint f22255c;

    /* renamed from: d */
    public android.graphics.Paint f22256d;

    /* renamed from: e */
    public android.graphics.Paint f22257e;

    public AbstractC5773c(p141i3.C3066a r3, p323s3.C5953g r4) {
            r2 = this;
            r2.<init>(r4)
            r2.f22254b = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 1
            r3.<init>(r4)
            r2.f22255c = r3
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r3.setStyle(r0)
            android.graphics.Paint r3 = new android.graphics.Paint
            r0 = 4
            r3.<init>(r0)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r4)
            r2.f22257e = r3
            r0 = 63
            int r0 = android.graphics.Color.rgb(r0, r0, r0)
            r3.setColor(r0)
            android.graphics.Paint r3 = r2.f22257e
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r3.setTextAlign(r0)
            android.graphics.Paint r3 = r2.f22257e
            r0 = 1091567616(0x41100000, float:9.0)
            float r0 = p323s3.AbstractC5952f.m12377d(r0)
            r3.setTextSize(r0)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r4)
            r2.f22256d = r3
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r4)
            android.graphics.Paint r3 = r2.f22256d
            r4 = 1073741824(0x40000000, float:2.0)
            r3.setStrokeWidth(r4)
            android.graphics.Paint r3 = r2.f22256d
            r4 = 255(0xff, float:3.57E-43)
            r0 = 187(0xbb, float:2.62E-43)
            r1 = 115(0x73, float:1.61E-43)
            int r4 = android.graphics.Color.rgb(r4, r0, r1)
            r3.setColor(r4)
            return
    }

    /* renamed from: m */
    public void m12091m(p267p3.InterfaceC5350d r3) {
            r2 = this;
            android.graphics.Paint r0 = r2.f22257e
            android.graphics.Typeface r1 = r3.mo9236a()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r2.f22257e
            float r3 = r3.mo9229M()
            r0.setTextSize(r3)
            return
    }

    /* renamed from: n */
    public abstract void mo12092n(android.graphics.Canvas r1);

    /* renamed from: o */
    public abstract void mo12093o(android.graphics.Canvas r1);

    /* renamed from: p */
    public abstract void mo12094p(android.graphics.Canvas r1, p230n3.C4684b[] r2);

    /* renamed from: q */
    public abstract void mo12095q(android.graphics.Canvas r1);

    /* renamed from: r */
    public abstract void mo12096r();

    /* renamed from: s */
    public boolean m12097s(p245o3.InterfaceC4889b r3) {
            r2 = this;
            l3.d r0 = r3.getData()
            int r0 = r0.m9250d()
            float r0 = (float) r0
            int r3 = r3.getMaxVisibleCount()
            float r3 = (float) r3
            java.lang.Object r1 = r2.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            float r1 = r1.f22873i
            float r3 = r3 * r1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
    }
}
