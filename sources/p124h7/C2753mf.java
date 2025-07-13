package p124h7;

/* renamed from: h7.mf */
/* loaded from: classes.dex */
public final class C2753mf implements android.os.Parcelable.Creator<p124h7.C2735lf> {
    public C2753mf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2735lf createFromParcel(android.os.Parcel r12) {
            r11 = this;
            int r0 = p270p6.C5368b.m11710t(r12)
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = r1
            r7 = r6
            r8 = r2
            r10 = 0
        Lc:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L42
            int r1 = r12.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 2
            if (r2 == r3) goto L3c
            r3 = 3
            if (r2 == r3) goto L36
            r3 = 4
            if (r2 == r3) goto L30
            r3 = 5
            if (r2 == r3) goto L2a
            p270p6.C5368b.m11709s(r12, r1)
            goto Lc
        L2a:
            boolean r1 = p270p6.C5368b.m11700j(r12, r1)
            r10 = r1
            goto Lc
        L30:
            long r1 = p270p6.C5368b.m11706p(r12, r1)
            r8 = r1
            goto Lc
        L36:
            java.lang.String r1 = p270p6.C5368b.m11695e(r12, r1)
            r7 = r1
            goto Lc
        L3c:
            java.lang.String r1 = p270p6.C5368b.m11695e(r12, r1)
            r6 = r1
            goto Lc
        L42:
            p270p6.C5368b.m11699i(r12, r0)
            h7.lf r12 = new h7.lf
            r5 = r12
            r5.<init>(r6, r7, r8, r10)
            return r12
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2735lf[] newArray(int r1) {
            r0 = this;
            h7.lf[] r1 = new p124h7.C2735lf[r1]
            return r1
    }
}
