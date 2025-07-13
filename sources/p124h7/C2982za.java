package p124h7;

/* renamed from: h7.za */
/* loaded from: classes.dex */
public final class C2982za implements android.os.Parcelable.Creator<p124h7.C2964ya> {
    public C2982za() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2964ya createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = p270p6.C5368b.m11710t(r8)
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L37
            int r4 = r8.readInt()
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            r6 = 1
            if (r5 == r6) goto L32
            r6 = 2
            if (r5 == r6) goto L2b
            r6 = 3
            if (r5 == r6) goto L22
            p270p6.C5368b.m11709s(r8, r4)
            goto L7
        L22:
            android.os.Parcelable$Creator<v9.j0> r3 = p375v9.C6605j0.CREATOR
            android.os.Parcelable r3 = p270p6.C5368b.m11694d(r8, r4, r3)
            v9.j0 r3 = (p375v9.C6605j0) r3
            goto L7
        L2b:
            android.os.Parcelable$Creator<h7.oe> r2 = p124h7.C2788oe.CREATOR
            java.util.ArrayList r2 = p270p6.C5368b.m11698h(r8, r4, r2)
            goto L7
        L32:
            java.lang.String r1 = p270p6.C5368b.m11695e(r8, r4)
            goto L7
        L37:
            p270p6.C5368b.m11699i(r8, r0)
            h7.ya r8 = new h7.ya
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2964ya[] newArray(int r1) {
            r0 = this;
            h7.ya[] r1 = new p124h7.C2964ya[r1]
            return r1
    }
}
