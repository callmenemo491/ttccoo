package p124h7;

/* renamed from: h7.ne */
/* loaded from: classes.dex */
public final class C2770ne implements android.os.Parcelable.Creator<p124h7.C2752me> {
    public C2770ne() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2752me createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = p270p6.C5368b.m11710t(r10)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        La:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L44
            int r1 = r10.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r8 = 2
            if (r2 == r8) goto L3f
            r8 = 3
            if (r2 == r8) goto L3a
            r8 = 4
            if (r2 == r8) goto L35
            r8 = 5
            if (r2 == r8) goto L30
            r8 = 6
            if (r2 == r8) goto L2b
            p270p6.C5368b.m11709s(r10, r1)
            goto La
        L2b:
            java.lang.Long r7 = p270p6.C5368b.m11707q(r10, r1)
            goto La
        L30:
            java.lang.String r6 = p270p6.C5368b.m11695e(r10, r1)
            goto La
        L35:
            java.lang.Long r5 = p270p6.C5368b.m11707q(r10, r1)
            goto La
        L3a:
            java.lang.String r4 = p270p6.C5368b.m11695e(r10, r1)
            goto La
        L3f:
            java.lang.String r3 = p270p6.C5368b.m11695e(r10, r1)
            goto La
        L44:
            p270p6.C5368b.m11699i(r10, r0)
            h7.me r10 = new h7.me
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2752me[] newArray(int r1) {
            r0 = this;
            h7.me[] r1 = new p124h7.C2752me[r1]
            return r1
    }
}
